import java.util.*;
public class Program{
    public static void main(String[] args){
        int id;
        String name;
        Scanner sc=new Scanner(System.in);
        id=sc.nextInt();
        name=sc.next();
        child c=new child();
        c.display(id,name);

    }
}
class child{
    void display(int id,String name){
        System.out.println(id);
        System.out.println(name);
    }
}