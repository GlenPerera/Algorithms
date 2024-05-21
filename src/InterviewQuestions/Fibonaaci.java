package InterviewQuestions;

public class Fibonaaci {
    public static void fib(int count){
        int a=0, b=1;
        System.out.print(a + " " + b + " ");
        for(int i=2; i<=count; i++){
            int sum = a+b;
            System.out.print(sum + " ");
            a=b;
            b=sum;
        }
    }

    public static void main(String[] args) {
        int count = 10;
        fib(count);
    }

}
