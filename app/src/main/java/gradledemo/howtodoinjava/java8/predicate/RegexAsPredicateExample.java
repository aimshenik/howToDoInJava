package gradledemo.howtodoinjava.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RegexAsPredicateExample {
    public static void main(String[] args){
        Predicate<String> predicate = Pattern
                .compile("^(.+)@example.com$")
                .asPredicate();

        List<String> emails = Arrays.asList("alex@example.com", "bob@yahoo.com",
                "cat@google.com", "david@example.com");

        List<String> desiredEmails = emails.stream()
                .filter(predicate)
                .collect(Collectors.toList());

        desiredEmails.forEach(System.out::println);
    }
}
