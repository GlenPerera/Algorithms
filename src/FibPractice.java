public class FibPractice {

    public static void fibonaaciPattern(int count){
        int a =0, b=1;
        System.out.print(a + " " + b + " ");
        for(int i=2; i<= count; i++){
            int sum = a+b;
            System.out.print(sum + " ");
            a = b;
            b = sum;

        }

    }

    public static void main(String[] args) {
        fibonaaciPattern(5);
    }
}
