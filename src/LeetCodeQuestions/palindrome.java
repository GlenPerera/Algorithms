package LeetCodeQuestions;

public class palindrome {
    public static boolean isPalindrome(int num) {
        if (num < 0){
            return false;

        }

        int reversed = 0;
        int original = num;

        while (num > reversed){
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return num == reversed || num == original;




    }

}
