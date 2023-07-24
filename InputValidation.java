import java.util.regex.Pattern;

public class InputValidation {
    public static void main(String[] args) {
        //10 digit mobile number validation regex pattern
        //String tenDigitNumber = "[0][7][01245678][0-9]{7}";
        String tenDigitNumber = "[0][7][^39][0-9]{7}";

        //10 digit or 9 digit mobile number validation pattern
        String tenOrNineDigitNumber = "0?[7][^39][0-9]{7}";

        //10 digit or 9 digit or number with country code validation pattern
        String tenNineCodeDigitNumber = "(0|94)?[7][^39][0-9]{7}";

        //mobile number validation
        validation("0719459621", tenNineCodeDigitNumber);
        validation("774515124", tenNineCodeDigitNumber);
        validation("94784545631", tenNineCodeDigitNumber);

        validation("7890785", tenNineCodeDigitNumber);
        validation("90781254620", tenNineCodeDigitNumber);
        validation("enter", tenNineCodeDigitNumber);

        System.out.println();
        //gmail pattern for validation
        String gMailPattern = "[a-zA-Z0-9][a-zA-Z0-9._]*@gmail[.]com";

        //any mail pattern for validation contain company mails also
        String anyMailPattern = "[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";

        //email validation
        validation("tharindu@gmail.com", gMailPattern);
        validation("tharindu@gmail.com", anyMailPattern);
        validation("dilshan@iit.ac.lk", anyMailPattern);

        validation("tharindu@gmail.", anyMailPattern);


        //password validation
        // must contain an uppercase letter, lowercase letter @#$& symbol and contain minimum 8 characters and maximum 12 characters
        String passwordPattern = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$&]).{8,12})";

        validation("dio@INDIA123", passwordPattern);


    }

    public static void validation(String inputString, String pattern){
        //check the string matches with the given pattern
        Boolean isMatch = Pattern.compile(pattern).matcher(inputString).matches();

        //show the status with the string
        System.out.println("Input String: \"" + inputString +"\" Validation Result: " + isMatch);
    }
}
