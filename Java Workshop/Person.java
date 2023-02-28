import javax.sound.sampled.SourceDataLine;

public class Person {
    private String name;
    private String lastName;

    public Person(){
        name = "";
        lastName = "";

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString(){
        return "Name " + this.name + " Last name " + this.lastName;
    }

    
}
