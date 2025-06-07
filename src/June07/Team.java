package June07;

public class Team {

    private String playerUsername;
    private String playerEmail;
    private String playerPassword;
    private double salary;

    public String getPlayerUsername() {
        return playerUsername;
    }

    public String getPlayerEmail() {
        return playerEmail;
    }

    public void setPlayerPassword(String playerPassword) {
        this.playerPassword = playerPassword;
    }

    public Team(String playerUsername, String playerEmail, String playerPassword, double salary) {
        this.playerUsername = playerUsername;
        this.playerEmail = playerEmail;
        this.playerPassword = playerPassword;
        this.salary = salary;
    }

    public void logindetails(String playerEmail, String playerPassword){
        if (playerEmail.equalsIgnoreCase(this.playerEmail) && playerPassword.equals(this.playerPassword)){
            System.out.println("Login Successfully");
        } else {
            System.out.println("Incorrect Username or Password. Please check it again!");
        }
    }


}
