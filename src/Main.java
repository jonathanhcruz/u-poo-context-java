public class Main {
    public static void main(String[] args) {
        SoccerPlayer messi = new SoccerPlayer(
        "Lionel",
        "Messi",
        36,
        "Argentinian",
        "Forward",
        10,
        1.70,
        72,
        "Inter Miami"
        );

        System.out.println(messi.playerInfo());

        messi.run();
        messi.pass();
        messi.shoot();
        messi.defend();
        messi.jump();
        messi.celebrateGoal();
    }
}