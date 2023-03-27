
public class Person {
    private String name;
    private String lastName;

  //Point a done
    public Person(String name, String LastName){
    this.name = name;
    this.lastName = LastName;
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

    //Point b done
    public String toString(){
        return "Name: " + this.name + " Last name: " + this.lastName;
    }
}
