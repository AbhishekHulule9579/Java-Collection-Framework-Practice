package DSA.TCS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Team_Selection {
    public static List<Integer> smallestTeam(String requiredSkills,String[] candidates){
        int m=requiredSkills.length();
        Map<Character,Integer>skillMap=new HashMap<>();
        for(int i=0;i<m;i++){
            skillMap.put(requiredSkills.charAt(i),i);
        }
        Map<Integer,List<Integer>>dp=new HashMap<>();
        dp.put(0,new ArrayList<>());
        for(int i=0;i<candidates.length;i++){
            int candidateMask=0;
            for(char c:candidates[i].toCharArray()){
                if(skillMap.containsKey(c)){
                    candidateMask |=(1<<skillMap.get(c));
                }
            }
            Map<Integer,List<Integer>>newDp=new HashMap<>(dp);
            for(int mask:dp.keySet()){
                int combinedMask = mask | candidateMask;
                if (!newDp.containsKey(combinedMask) ||
                        newDp.get(combinedMask).size() > dp.get(mask).size() + 1) {

                    List<Integer> newTeam = new ArrayList<>(dp.get(mask));
                    newTeam.add(i);
                    newDp.put(combinedMask, newTeam);
                }
            }
            dp=newDp;
        }
        int fullMask=(1<<m)-1;
        return dp.get(fullMask);
    }

    public static void main(String[] args) {
        String requiredSkills = "abcd";
        String[] candidates = {"ab", "bc", "cd", "d"};

        System.out.println(smallestTeam(requiredSkills, candidates));

        String requiredSkills2 = "abc";
        String[] candidates2 = {"a", "bc", "c"};

        System.out.println(smallestTeam(requiredSkills2, candidates2));
    }
}

/*
2. Minimum Team Selection to Cover Required Skills
Problem Statement:
You are given a list of required skills and a list of candidates, where each candidate has a subset of skills. Your task is to find the smallest possible tea such that all required skills are covered.
You will be given.
1. Required skills list
2. Number of candidates (N)
3. Skillsets of N candidates
Return the indices of selected candidates forming smallest team.
Example:
Input:
abcd
4
ab
bc
cd
d
Output:
02
Input:
abc
3
a
bc
C
Output:
01
**/