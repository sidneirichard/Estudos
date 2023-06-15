public class ElectricGuitar {
    public String brand;
    public String color;
    public int numString;
    public boolean on = true;

    public String getBrand(String b) {
        return brand;
    }

    public void setBrand(String b) {
        this.brand = b;
    }

    public String getColor(String c) {
        return color = c;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public int getNumString(int i) {
        return i;
    }

    public void setNumString(int numString) {
        this.numString = numString;
    }

    public boolean isOn(boolean on) {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void turnOn(){
        if(false){
            this.isOn(true);
        }else{
            this.isOn(false);
        }
    }
}
