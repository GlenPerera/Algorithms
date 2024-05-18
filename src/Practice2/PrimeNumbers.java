package Practice2;

public class PrimeNumbers {
    public static boolean isPrime(int n){

        //A prime number is defined as a number greater than 1 that has no divisors other than 1 and itself. To check if
        //n is prime, you need to see if it has any divisors other than 1 and
        //𝑛
        //n
        if (n <= 1){
            return false;
        }

        for (int i=2; i<= Math.sqrt(n); i++){
            if (n % i == 0){ //if divisors available, its not prime
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       int n = 2;
       if (isPrime(n)){
           System.out.println(n + " is a prime number");
       }

       else{
           System.out.println(n + " is not a prime number");
       }
    }
}
