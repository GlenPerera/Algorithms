package Practice1;

public class Reverse {

    public static void main(String[] args) {
        String str = "Ziznomac Labs";
        System.out.println(reverse(str));

    }

   public static String reverse(String str){
        if (str == null || str.length() <= 1){
            return str;
        }

        return (reverse(str.substring(1)) + str.charAt(0));
   }
}