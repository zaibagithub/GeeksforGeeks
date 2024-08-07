// Prime number = Number which is divisible by 1 and itself
// Prime number will exactly have 2 divisors

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       int count = 0;
       for(int i=1;i<=number;i++){
           if(number % i == 0){
               count++;
           }
       }
       if(number == 1){
           System.out.print("Neither Prime nor composite");
       }
       else if(count == 2){
           System.out.print("Prime");
       }
       else{
           System.out.print("Not Prime");
       }
    }
}
