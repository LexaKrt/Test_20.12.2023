public class Person {

    Role role;

    public Person(Role role) {
        this.role = role;
    }
    enum Role {
        EVEN,
        ODD,
        EMPLOYEE
    }
}