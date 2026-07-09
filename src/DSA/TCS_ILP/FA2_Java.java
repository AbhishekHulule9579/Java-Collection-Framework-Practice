package DSA.TCS_ILP;

import java.util.Scanner;

class Element{
    private int atomicNumber;
    private String elementName;
    private String symbol;
    private int noOfProtons;
    private int noOfNeutrons;

    public Element(int atomicNumber,String elementName,String symbol,int noOfProtons,int noOfNeutrons){
        this.atomicNumber=atomicNumber;
        this.elementName=elementName;
        this.symbol=symbol;
        this.noOfProtons=noOfProtons;
        this.noOfNeutrons=noOfNeutrons;
    }
    public Element(){}

    public int getAtomicNumber(){
        return atomicNumber;
    }
    public String getElementName(){
        return elementName;
    }
    public String getSymbol(){
        return symbol;
    }
    public int getNoOfProtons(){
        return noOfProtons;
    }
    public int getNoOfNeutrons(){
        return noOfNeutrons;
    }
    public void setAtomicNumber(int atomicNumber){
        this.atomicNumber=atomicNumber;
    }
    public void setElementName(String elementName){
        this.elementName=elementName;
    }
    public void setSymbol(String symbol){
        this.symbol=symbol;
    }
    public void setNoOfProtons(int noOfProtons){
        this.noOfProtons=noOfProtons;
    }
    public void setNoOfNeutrons(int noOfNeutrons){
        this.noOfNeutrons=noOfNeutrons;
    }

    public void findAtomicMassOfEachElement(Element[] e){
        for(int i=0;i<e.length;i++){
            int atomicMass=e[i].getNoOfProtons()+e[i].getNoOfNeutrons();
            System.out.println(atomicMass);
        }
    }
}

public class FA2_Java {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Element[] arr=new Element[n];

        for(int i=0;i<n;i++){
            int atomicNumber=sc.nextInt();
            String elementName=sc.next();
            String symbol=sc.next();
            int noOfProtons=sc.nextInt();
            int noOfNeutrons=sc.nextInt();

            arr[i]=new Element(atomicNumber,elementName,symbol,noOfProtons,noOfNeutrons);
        }
        Element obj=new Element();
        obj.findAtomicMassOfEachElement(arr);

        sc.close();
    }
}
