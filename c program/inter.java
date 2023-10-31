import java.util.*;
public class inter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int width=sc.nextInt();
        Rectangle r=new Rectangle();
        r.resizeWidth(width);
        r.printSize();
    }
}
interface Resizable{
    void resizeWidth(int width);
//abstract void resizeHeight(int height);
}
class Rectangle implements Resizable{
    int width;
    public void resizeWidth(int width){
        width=width+5;
        System.out.println(width);
     }

}
