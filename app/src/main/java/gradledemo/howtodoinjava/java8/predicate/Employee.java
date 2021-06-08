package gradledemo.howtodoinjava.java8.predicate;

public class Employee {
    private String firstName;
    private String lastName;
    private String gender;
    private Integer age;
    private Integer id;

    public Employee(Integer id, Integer age, String gender, String firstName, String lastName ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString(){
        return id + " - " + age;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getGender(){
        return gender;
    }

    public Integer getAge(){
        return age;
    }

    public Integer getId(){
        return id;
    }





}
