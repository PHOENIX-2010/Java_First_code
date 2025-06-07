package June07;

public class MainTeam {
    public static void main(String[] args) {

        Team team = new Team("utpatel", "utpatel2010@gmail.com", "Utsav@12345", 150000);
        System.out.println(team);

        System.out.println("Player Email ID: " + team.getPlayerEmail());
        System.out.println("Player Username: " + team.getPlayerUsername());

        System.out.println("===========================================");

        team.logindetails("utpatel2010@gmail.com", "Utsav12456");

        team.setPlayerPassword("utsavpatel12345");

    }
}
