
public class Person {
    private String name;
    private String lastName;

    

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

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
        return   
this.name + " " + this.lastName;
    }

    
}
