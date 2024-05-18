package Practice1;

public class Reversemethod2 {

    public static void main(String[] args) {
        String s = "Sandy";
        System.out.println(reverse(s));

    }

    private static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for(int i=str.length() -1; i>=0; i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
