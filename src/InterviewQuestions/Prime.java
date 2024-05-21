package InterviewQuestions;

public class Prime {
    public static String isPrime(int n) {
       if (n <= 1){
           return "Not a Prime Number";
       }
       for (int i = 2; i < Math.sqrt(n); i++) {
           if (n % i == 0) {
               return "Not a Prime Number";
           }
       }

       return n + " Is a prime Number";
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(isPrime(n));
    }
}
