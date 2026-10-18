import java.util.Scanner;

public class Factorial {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to find the factorial: ");
        long n1 = s.nextLong();
        System.out.println("Factorial of " + n1 + " is: " + factorial(n1));
    }

    public static long factorial(long n){
        if(n >= 1){
            return n*factorial(n-1);
        }
        else{
            return 1;
        }
    }
}
