import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Central {
    public static void main(String[] main) {

//        InsideOfCalculator insideOfCalculator = new InsideOfCalculator();
//        insideOfCalculator.start();


        Pattern pattern =  Pattern.compile("[2-7]");
        Matcher matcher = pattern.matcher("A1BC5AADE8");
        matcher.find();
        System.out.println(matcher.start());
        System.out.println(matcher.group());
    }
}
