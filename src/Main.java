import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SoccerPlayer soccerPlayer1 = new SoccerPlayer("Goalkeeper", "Yan", "Oblak", LocalDate.of(1993, 1, 7),
                188, 83.3f);
        SoccerPlayer soccerPlayer2 = new SoccerPlayer("SZ", "Ramos", "Sergio", LocalDate.of(1986, 3, 30),
                184, 84.6f);
        SoccerPlayer soccerPlayer3 = new SoccerPlayer("PZ", "Dani", "Carvajal", LocalDate.of(1992, 1, 11),
                173, 73.4f);
        SoccerPlayer soccerPlayer4 = new SoccerPlayer("LZ", "Theo", "Hernandez", LocalDate.of(1997, 10, 7),
                184, 86.4f);
        SoccerPlayer soccerPlayer5 = new SoccerPlayer("PP", "Bruno", "Fernandes", LocalDate.of(1994, 9, 8),
                179, 78.7f);
        SoccerPlayer soccerPlayer6 = new SoccerPlayer("LP", "Neymar", "JR", LocalDate.of(1992, 2, 5),
                175, 76.6f);
        SoccerPlayer soccerPlayer7 = new SoccerPlayer("SOP", "Messi", "Lionel", LocalDate.of(1987, 6, 24),
                170, 69.5f);
        SoccerPlayer soccerPlayer8 = new SoccerPlayer("PV", "Kylian", "Mbappe", LocalDate.of(1998, 12, 20),
                182, 73.6f);
        SoccerPlayer soccerPlayer9 = new SoccerPlayer("LV", "Ronaldo", "Cristiano", LocalDate.of(1985, 2, 5),
                185, 79.4f);
        SoccerPlayer soccerPlayer10 = new SoccerPlayer("NAP", "Robert", "Lewandowski", LocalDate.of(1988, 8, 21),
                185, 81.8f);
        SoccerPlayer soccerPlayer11 = new SoccerPlayer("NAP", "Karim", "Benzema", LocalDate.of(1987, 12, 19),
                185, 81f);

        SoccerPlayer[] soccerPlayers = {soccerPlayer1,soccerPlayer2,soccerPlayer3,soccerPlayer4,soccerPlayer5,
                soccerPlayer6,soccerPlayer7,soccerPlayer8,soccerPlayer9,soccerPlayer10,soccerPlayer11};

        Trainer trainer = new Trainer("Zidane","Zinedine",soccerPlayers);

        System.out.println(trainer.toString());
    }
}