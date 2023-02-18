import java.util.Arrays;

public class Trainer {
    private String firstName;
    private String lastName;
    private SoccerPlayer [] soccerPlayers;

    public Trainer(String firstName, String lastName, SoccerPlayer[] soccerPlayers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.soccerPlayers = soccerPlayers;
    }

    public Trainer() {
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

    public SoccerPlayer[] getSoccerPlayers() {
        return soccerPlayers;
    }

    public void setSoccerPlayers(SoccerPlayer[] soccerPlayers) {
        this.soccerPlayers = soccerPlayers;
    }

    public String players(){
        String player = "\n";
        for (SoccerPlayer s:soccerPlayers) {
            player += s.toString();
        }
        return player;
    }

    @Override
    public String toString() {
        return "\nTrainer" +
                "\nFirst name: " + firstName +
                "\nLast name: " + lastName +
                 "\nPlayers" + players();
    }
}
