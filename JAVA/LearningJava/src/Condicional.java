public class learningJava {
    public String greetings(int message) {
        String greetings;
        if (message == 0) {
            greetings = "morning";
        } else {
            greetings = "afternoon";
        }
        return "Good " + greetings;
    }
}