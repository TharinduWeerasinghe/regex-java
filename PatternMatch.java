import java.util.regex.*;
public class PatternMatch {
    public static void main(String[] args) {

        //count the number of occurrences using string patterns
        //check abc how many times in the given text
        printNoOfOccurrences("abc", "abccabcdabcd");


        //count number of occurrences using special string characters
        //[a] this means either a and [^a] means except a
        printNoOfOccurrences("[a]", "abcabccbc");

        // "\\s" - spaces "\\S" - except spaces "\\d" - digit  "\\w" - words  "." - any character
        printNoOfOccurrences(".", "aew@ 3925");

        //System.out.println(isMatchPattern("ab", "ab"));

    }

    public static void printNoOfOccurrences(String regexPattern, String stringValue){
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(stringValue);

        //count of number of occurrences
        int count = 0;

        while (matcher.find()){
            count++;
            //start method returns the starting index and end method returns the end index + 1
            System.out.println(matcher.start() + ".." + matcher.end());
        }
        System.out.println("Number of occurrences: " + count);
        System.out.println();
    }

    public static Boolean isMatchPattern(String regexPattern, String stringValue){
//        Pattern pattern = Pattern.compile(regexPattern);
//        Matcher matcher = pattern.matcher(stringValue);
//        Boolean isMatch = matcher.matches();
//        return isMatch;

        return Pattern.compile(regexPattern).matcher(stringValue).matches();
    }
}