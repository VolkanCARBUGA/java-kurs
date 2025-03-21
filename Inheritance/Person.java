package Inheritance;

public class Person {
    int id;
    String firstName;
    String lastName;
    int age;

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(int age, String firstName, int id, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.id = id;
        this.lastName = lastName;
    }
    
    
}
