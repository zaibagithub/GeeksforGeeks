import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       int[] arr={2,3,6,91,100};
       int largest=Integer.MIN_VALUE;
       int second=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
           if(arr[i]>largest){
               largest=arr[i];
           }
       }
       for(int i=0;i<arr.length;i++){
           if(arr[i]!=largest && arr[i]>second){
               second=arr[i];
           }
       }
       System.out.print(second);
    }
}
