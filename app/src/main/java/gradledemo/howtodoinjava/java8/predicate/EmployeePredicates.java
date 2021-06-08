package gradledemo.howtodoinjava.java8.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicates {

    public static Predicate<Employee> isAdultMale(){
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
    }

    public static Predicate<Employee> isAdultFemale(){
        return  p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("F");
    }

    public static Predicate<Employee> isAgeMoreThan(int age){
        return p -> p.getAge() > age;
    }

    public static List<Employee> filterEmployee(List<Employee> employees, Predicate<Employee> employeePredicate){
        return employees.stream()
                .filter(employeePredicate)
                .collect(Collectors.toList());
    }
}
