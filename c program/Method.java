public class Method {
    public static void main(String[] args){
    Parent p=new Parent();
    p.display(4);
    p.diaplay(4,6);
    }
}
class Parent{
    void display(int a){
        System.out.println(a);
    }
    void  diaplay(int a,int b){
        System.out.println(a+b);
    }
}
