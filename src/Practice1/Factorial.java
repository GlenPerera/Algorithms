package Practice1;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        //Done using recursion
        if (n == 0 || n== 1){
            return 1;
        }

        else{
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        System.out.println("Practice1.Factorial of "+n+" is "+factorial(n));
    }
}
