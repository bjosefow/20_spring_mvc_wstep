package pl.bjosefow.mvcproject;

public class User {
    private String firstname;
    private String lastname;
    private Integer age;

    public User(String firstname, String lastname, Integer age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname + " " + age;
    }
}
