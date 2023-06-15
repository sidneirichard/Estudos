class ElectricGuitar {
    String brand;
    String color;
    int numOfStrings;
    boolean isOn;

    void playIt(){
        System.out.println("Playing a guitar of brand " + getBrand() + ", color " + getColor() + " and have " + numOfStrings + " strings");
    }

    public ElectricGuitar(String brand, String color, int numOfStrings) {
        this.brand = brand;
        this.color = color;
        this.numOfStrings = numOfStrings;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String aBrand) {
        this.brand = aBrand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public void setNumOfStrings(int numOfStrings) {
        this.numOfStrings = numOfStrings;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}