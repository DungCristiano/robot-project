public class WelcomeScreen {
    private String teamName;

    public WelcomeScreen(String teamName) {
        this.teamName = teamName;
    }

    public void displayWelcomeMessage() {
        System.out.println("************WELCOME TO************");
        System.out.println("*************" + teamName + "**************");
    }

    public static void main(String[] args) {
        // Ví dụ sử dụng cho các team khác nhau
        WelcomeScreen teamA = new WelcomeScreen("Team DungTQ");

        teamA.displayWelcomeMessage();
    }
}
