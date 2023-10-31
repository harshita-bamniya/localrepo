import java.util.*;
public class Parent {
    Parent(){
        System.out.println("hello");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        new Child(i,j);
        // new Child(10);
    }
}
class Child extends Parent{
        Child(int i){
            System.out.println(i);
        }
        Child(int i,int j){
            this(i);
            System.out.println(i+" "+j);
        }
    }
