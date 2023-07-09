import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reservse_WordString {

    static void reverse(String str){
        str = str.trim(); // remove leading and trailing spaces
        String[] words = str.split(" ");
         List<String> wordList = Arrays.asList(words);
         Collections.reverse(wordList);
         String result = String.join(" ",wordList);
         System.out.println(result);

    }
    public static void main(String[] args) {
        String str = "hello world";
        reverse(str);
        
    }
    
}
