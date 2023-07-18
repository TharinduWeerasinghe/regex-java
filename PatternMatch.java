import java.util.regex.*;

public class PatternMatch {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("ab");
        Matcher matcher = pattern.matcher("abababbbaab");

        int count = 0;
        int count2;

        while (matcher.find()){
            count++;
            System.out.println(matcher.start() + ".." + matcher.end());
        }
        System.out.println("Number of occurrences: " + count);
    }
}