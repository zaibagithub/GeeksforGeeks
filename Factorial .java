import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       long factorial = calculate(number);
       System.out.println(factorial);
    }
    public static long calculate(int number){
        int factorial = 1;
        for(int i=1;i<=number;i++){
            factorial *= i;
        }
        return factorial;
    }
}
