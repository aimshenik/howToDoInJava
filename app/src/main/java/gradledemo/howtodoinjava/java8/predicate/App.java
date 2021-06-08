package gradledemo.howtodoinjava.java8.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static gradledemo.howtodoinjava.java8.predicate.EmployeePredicates.*;

public class App {
    public static void main(String[] args){
        Employee e1 = new Employee(1,23,"M","Rick","Beethovan");
        Employee e2 = new Employee(2,13,"F","Martina","Hengis");
        Employee e3 = new Employee(3,43,"M","Ricky","Martin");
        Employee e4 = new Employee(4,26,"M","Jon","Lowman");
        Employee e5 = new Employee(5,19,"F","Cristine","Maria");
        Employee e6 = new Employee(6,15,"M","David","Feezor");
        Employee e7 = new Employee(7,68,"F","Melissa","Roy");
        Employee e8 = new Employee(8,79,"M","Alex","Gussin");
        Employee e9 = new Employee(9,15,"F","Neetu","Singh");
        Employee e10 = new Employee(10,45,"M","Naveen","Jain");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10));

        System.out.println(EmployeePredicates
                .filterEmployee(employeeList, isAgeMoreThan(25)));
        System.out.println(EmployeePredicates
                .filterEmployee(employeeList, isAdultMale()));
        System.out.println(EmployeePredicates
                .filterEmployee(employeeList, isAgeMoreThan(14).negate()));
    }
}
