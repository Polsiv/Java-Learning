public class motor {
    private String  serial;
    private String brand;

    //cosntructors
    public motor(String Serial, String Brand){
        this.brand = Brand;
        this.serial = Serial;
    }

    //Getters
    public String getBrand() {
        return brand;
    }
    public String getSerial() {
        return serial;
    }

    //Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setSerial(String serial) {
        this.serial = serial;
    }

    //string tostring
    public String toString(){
        return "Brand: " + this.brand + " Serial: " + this.serial;
    }
}
