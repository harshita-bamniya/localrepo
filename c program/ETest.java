import java.util.*;
public class ETest{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int id=sc.nextInt();
    String name=sc.next();
    Employee em=new Employee();
    // em.getData(id,name);
    em.printData(id,name);
    }
}
class Employee{
    // int id;a
    // String name;
    // void getData(int id,String name){
    //  this.id=id;
    //  this.name=name;
    // }
    void printData(int id,String name){
    System.out.println(id+" "+name);
    }
}