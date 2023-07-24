import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSplit {

    public static void main(String[] args) {

        //Pattern class split method
        //using this we can split string to String array by giving the character to split the String
        //split the string by using space
        //\\. split by dot
        System.out.println("Pattern Class Split Method");
        Pattern pattern = Pattern.compile("\\s");

        //spit the string by space and store words in the string type array
        String[] wordsArray = pattern.split("Tharindu Dilshan weerasinghe");

        //print the array length
        System.out.println("Array Length: " + wordsArray.length);

        for (int i = 0; i < wordsArray.length; i++){
            System.out.println(wordsArray[i]);
        }

        System.out.println();
        System.out.println("String Class Split Method");
        //String class split method
        String s = "Tharindu Dilshan weerasinghe";
        String[] wordsArray2 = s.split("\\s");
        System.out.println("Array Length: " + wordsArray2.length);

        for (int i = 0; i < wordsArray2.length; i++){
            System.out.println(wordsArray2[i]);
        }

    }


}
