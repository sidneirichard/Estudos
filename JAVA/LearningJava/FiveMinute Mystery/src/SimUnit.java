public class SimUnit {
    String botType;

    public SimUnit(String botType) {
        this.botType = botType;
    }

    int powerUse() {
        if ("Retention".equals(botType)) {
            return 2;
        } else {
            return 4;
        }
    }
}