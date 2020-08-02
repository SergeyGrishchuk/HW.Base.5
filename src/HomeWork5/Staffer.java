package HomeWork5;

public class Staffer {
    String fullName;
    String position;
    String email;
    int saluly;
    int age;

    public Staffer(String fullName, String position, String email, int saluly, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.saluly = saluly;
        this.age = age;
    }

    public void info() {
        System.out.printf("fullName: %s, Position: %s, Email: %s, Saluly: %,d, Age: %d\n",
                            fullName, position, email, saluly, age);
    }
}
