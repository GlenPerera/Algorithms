package InterviewQuestions;

public class ReverseStr {
    public static String reverseString(String word){
        if (word.isEmpty()){
            return "Word Unavailable";
        }

        //Recursive call-take the last character and concatenate it with the result of reversing the rest of the string
        return reverseString(word.substring(1)) + word.charAt(0);
    }
}
