import java.text.SimpleDateFormat;
import java.util.*;
class Product{

    private String id;
    private String pname;
    private int qty;
    private double price;
    private double totalPrice;

    Product(String id,String pname,int qty,double price,double totalprice){
    this.id=id;
    this.pname=pname;
    this.qty=qty;
    this.price=price;
    this.totalPrice=totalPrice;
    }

    public String getId(){
        return id;
    }
    public String getPname(){
        return pname;
    }
    public int getQty(){
        return qty;
    }
    public double getPrice(){
        return price;
    }
    public double getTotalPrice(){
        return totalPrice;
    }

    public static void displayFormat(){
    System.out.format("-----------------------------------------------------");
    System.out.format("\n Product Id\t\tProduct Name\t\tQuantity\t\tPrice\t\t\t\tTotalPrice\n");
    System.out.format("-----------------------------------------------------");
    }

    public void display(){
        System.out.format("%-9s %-9s %5d %9.2f %14.2f\n",id,pname,qty,price,totalPrice);
    }
}

public class Shopping {
    public static void main(String[] args){
        String id=null;
        String pname=null;
        int qty=0;
        double price=0.0;
        double totalPrice=0.0;
        double overAllPrice=0.0;
        double cgst,sgst,subtotal=0.0,discount=0.0;
        char choice='\0';
        System.out.println("\t\t\t\thello\t\t\t\t");
        System.out.println("\t\t\t\tWelcome here\t\t\t\t");
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date date=new Date();
        Calendar calender=Calendar.getInstance();
        String[] days =new String[]{"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println("Date:"+formatter.format(date)+"  "+days[calender.get(Calendar.DAY_OF_WEEK)]);
        Scanner sc=new Scanner(System.in);
        String customerName=sc.nextLine();
    }
    
}
