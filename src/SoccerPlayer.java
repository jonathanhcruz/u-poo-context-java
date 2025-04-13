public class SoccerPlayer {
    // Atributos
    private String firstName;
    private String lastName;
    private int age;
    private String nationality;
    private String position;
    private int shirtNumber;
    private double height;
    private double weight;
    private String team;

    // Constructor
    public SoccerPlayer(String firstName, String lastName, int age, String nationality, String position,
        int shirtNumber, double height, double weight, String team) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nationality = nationality;
        this.position = position;
        this.shirtNumber = shirtNumber;
        this.height = height;
        this.weight = weight;
        this.team = team;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPosition() {
        return position;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getTeam() {
        return team;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    // Metodos
    public void run() {
        System.out.println(firstName + " " + lastName + " is running.");
    }

    public void pass() {
        System.out.println(firstName + " " + lastName + " is passing the ball.");
    }

    public void shoot() {
        System.out.println(firstName + " " + lastName + " is shooting at the goal.");
    }

    public void defend() {
        System.out.println(firstName + " " + lastName + " is defending.");
    }

    public void jump() {
        System.out.println(firstName + " " + lastName + " is jumping.");
    }

    public void celebrateGoal() {
        System.out.println(firstName + " " + lastName + " celebrates a goal!");
    }

    public String playerInfo() {
        return "FootballPlayer{" +
                '\n' + " firstName='" + firstName + '\'' +
                '\n' + " lastName='" + lastName + '\'' +
                '\n' + " age=" + age +
                '\n' + " nationality='" + nationality + '\'' +
                '\n' + " position='" + position + '\'' +
                '\n' + " shirtNumber=" + shirtNumber +
                '\n' + " height=" + height +
                '\n' + " weight=" + weight +
                '\n' + " team='" + team + '\'' +
                '\n' + '}';
    }
}