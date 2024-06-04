import java.time.LocalDate;

public class Human {
    int age;
    String firstName;
    String lastName;
    LocalDate birthDate;
    public int weight;
    Human(int age, String firstName, String lastName, LocalDate birthDate, int weight) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", fullName='" + firstName + ' ' + lastName +
                ", birthDate=" + birthDate +
                ", weight=" + weight +
                '}';
    }

}
