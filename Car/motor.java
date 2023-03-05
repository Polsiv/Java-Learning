public class motor {
    private String  serial;
    private String brand;

    //cosntructors
    public motor(String Serial, String Brand){
       setBrand(Brand);
       setSerial(Serial);
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
        return "Brand: " + getBrand()+ " Serial: " + getSerial();
    }
}
