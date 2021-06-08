package gradledemo.howtodoinjava.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexAndMatcherExample {
    public static void main(String[] args)
    {

        Pattern pattern = Pattern.compile("^(.+)@example.com$");

        // Input list
        List<String> emails = Arrays.asList("alex@example.com", "bob@yahoo.com",
                "cat@google.com", "david@example.com");

        for(String email : emails)
        {
            Matcher matcher = pattern.matcher(email);

            if(matcher.matches())
            {
                System.out.println(email);
            }
        }
    }
}
