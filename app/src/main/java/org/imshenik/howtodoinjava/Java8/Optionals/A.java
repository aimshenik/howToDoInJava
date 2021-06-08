package org.imshenik.howtodoinjava.Java8.Optionals;

import java.util.List;
import java.util.Optional;

public class A {
    public static void main(String[] args) {
        Optional<Integer> canBeEmpty1 = Optional.of(100);
        canBeEmpty1.ifPresent(System.out::println);
        canBeEmpty1.isPresent(); // true
        canBeEmpty1.get(); // == Integer.valueOf(5);

        Optional<Integer> canBeEmpty2 = Optional.empty();
        canBeEmpty2.isPresent(); // false


//        c) Default/absent values and actions
//Assume this value has returned from a method
        Optional<Company> companyOptional = Optional.empty();
//Now check optional; if value is present then return it,
//else create a new Company object and retur it
        Company company = companyOptional.orElse(new Company());
        //OR you can throw an exception as well
//        company = companyOptional.orElseThrow(IllegalStateException::new);

//        d) Rejecting certain values using the filter method
        companyOptional = Optional.of(new Company());
        companyOptional.filter(department -> "Finance".equals(department.getName().orElse("NOTHING")))
                .ifPresent(x -> System.out.println("Finance is present"));
        companyOptional.filter(department -> "NOTHING".equals(department.getName().orElse("NOTHING")))
                .ifPresent(x -> System.out.println("NOTHING is present"));
    }
}

class Company {
    private String name;

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
}

