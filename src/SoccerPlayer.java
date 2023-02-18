import java.time.LocalDate;

public class SoccerPlayer extends Sportsman{
    public SoccerPlayer(String role, String firstName, String lastName, LocalDate dayOfBirth, float height, float weight) {
        super(role, firstName, lastName, dayOfBirth, height, weight);
    }

    public SoccerPlayer() {
        super();
    }


    @Override
    public String firstName() {
        return super.firstName();
    }

    @Override
    public String lastName() {
        return super.lastName();
    }

    @Override
    public String height() {
        return super.height();
    }

    @Override
    public String age() {
        return super.age();
    }

    @Override
    public String weight() {
        return super.weight();
    }

    @Override
    public String toString() {
        return "\n\n" + super.toString() + firstName() + lastName() + age() + height() + weight();
    }
}
