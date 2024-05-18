//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        else{
             if (Math.sqrt(n) >= 2){
                 return n % 2 != 0;
             }
             return true;
        }
    }

    public static void main(String[] args) {
        int n= 4;
        if(isPrime(n)){
            System.out.println(n + " is a Prime Number");
        }
        else{
            System.out.println(n + " is Not a prime Number");
        }
    }
}