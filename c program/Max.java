public class Max {
    public static void main(String[] args){
        int[] arr={2,4,1,7,5};
        int j=0;
        //   for(int i=0;i<arr.length;i++){
        //     if(j<arr[i]){
        //         j=arr[i];
        //     }
        //   }
        //   System.out.println(j);

          for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
              j=arr[i];
            }
          }
          System.out.println(j);

          int[] a={1,2,3,4,5,6};
          for(int i=0;i<a.length-1;i++){
            if(a[i]<a[i+1]){
            }else{
                System.out.println("unsorted");
            }
          }
    }
}
