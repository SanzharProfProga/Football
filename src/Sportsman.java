import java.time.LocalDate;
import java.time.Period;

public abstract class Sportsman implements Playable {
    private String role;
    private String firstName;
    private String lastName;
    private LocalDate dayOfBirth;
    private byte age;
    private float height;
    private float weight;

    public Sportsman(String role, String firstName, String lastName, LocalDate dayOfBirth, float height, float weight) {
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = (byte) Period.between(dayOfBirth, LocalDate.now()).getYears();
        this.height = height;
        this.weight = weight;
    }

    public Sportsman() {
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }


    @Override
    public String firstName() {
        return "\nFirst name: " + firstName;
    }

    @Override
    public String lastName() {
        return "\nLast name: " + lastName;
    }

    @Override
    public String height() {
        return "\nHeight: " + height;
    }

    @Override
    public String age() {
        return "\nAge: " + age;
    }

    @Override
    public String weight() {
        return "\nWeight: " + weight ;
    }

    @Override
    public String toString() {
        return "\nRole: " + role;
    }
}
