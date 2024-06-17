package Practice4;

public class prime {
    public static String isPrime(int n) {
        if (n < 2){
            return "Not a prime number";
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return "Not a prime number";
            }



        }

        return "Prime number";
    }

    public static void main(String[] args) {
        System.out.println(isPrime(9));
    }
}
