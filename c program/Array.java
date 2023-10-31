import java.util.*;
import java.lang.*;
public class Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // float num=sc.nextFloat();
        // float[] marks={1.5f,3.3f,4.5f,5.f};
        // boolean arr=false;
        // for(float elements:marks){
        //    if(num==elements){
        //       arr=true;
        //       break;
        //    }
        // }
        // if(arr==true){
        //     System.out.println("Present");
        // }else{
        //     System.out.println("Absent");
        // }

        // int total=0;
        // int[] mark={20,40,60,70};
        // for(int elements:mark){
        // total=total+elements;
        // }
        // System.out.println(total/mark.length);
       

        int[][] mat1={{1,2,3},{4,5,6}};
        int[][] mat2={{3,2,1},{6,5,4}};
        int[][] mat3={{0,0,0},{0,0,0}};

        for(int i=0;i<mat1.length;i++){
             for(int j=0;j<mat1[i].length;j++){
                mat3[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(mat3[i][j]+" ");
             }
             System.out.println(" ");
        }

        // int[] arr={1,2,3,4,5,6};
        // int n=arr.length;
        // int m=Math.floorDiv(n,2);
        // for(int i=0;i<m;i++){
        //     int temp=arr[i];
        //     arr[i]=arr[n-1-i];
        //     arr[n-1-i]=temp;
        // }
        // for(int ele:arr){
        //     System.out.println(ele);
        // }

        int[] arr={6,5,4,3,2,1};
        int m=arr.length;
        int n=Math.floorDiv(m,2);
        for(int i=0;i<n;i++){
           int temp=arr[i];
           arr[i]=arr[m-1-i];
           arr[m-1-i]=temp;
        }
        for(int ele:arr){
            System.out.println(ele);
        }
    }
}
