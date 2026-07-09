package DSA.TCS_ILP;

import java.util.Scanner;

class Product{
    private int prodId;
    private String prodName;
    private double price;

public Product(int prodId,String prodName,double price) {
    this.prodId=prodId;
    this.prodName=prodName;
    this.price=price;
}
public int getProdId(){
    return prodId;
}
public String getProdname(){
    return prodName;
}
public double getPrice(){
    return price;
}
public void setPrice(double price){
    this.price=price;
}
}

public class FA1_Java {

    public static Product updatePriceForGivenStock(Product[] arr,int id,double price){
        for(int i=0;i<arr.length;i++){
            if(arr[i].getProdId()==id){
                arr[i].setPrice(price);
                return arr[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        sc.nextLine();

        Product[] arr=new Product[n];

        for(int i=0;i<n;i++){
            int id=sc.nextInt();
            sc.nextLine();

            String name=sc.nextLine();

            double price=sc.nextDouble();
            sc.nextLine();

            arr[i]=new Product(id,name,price);
        }

        int searchId=sc.nextInt();
        double newPrice=sc.nextDouble();

        Product result=updatePriceForGivenStock(arr,searchId,newPrice);

        if(result!=null){
            System.out.println(result.getProdId());
            System.out.println(result.getProdname());
            System.out.println(result.getPrice());
        }else{
            System.out.println("No product found");
        }
        sc.close();
    }
}
