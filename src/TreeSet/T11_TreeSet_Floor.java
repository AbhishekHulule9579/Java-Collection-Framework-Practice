package TreeSet;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class T11_TreeSet_Floor {
    public static void main(String[] args) {
        TreeSet<Integer>tree_num=new TreeSet<Integer>();
        TreeSet<Integer>treeheadset=new TreeSet<Integer>();
        tree_num.add(10);
        tree_num.add(22);
        tree_num.add(36);
        tree_num.add(25);
        tree_num.add(16);
        tree_num.add(70);
        tree_num.add(82);
        tree_num.add(89);
        tree_num.add(14);
        System.out.println("less than or equal to 86: "+treeheadset.floor(86));
        System.out.println("Less than or equal to 29: "+treeheadset.floor(29));
    }
}
