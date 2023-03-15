public class Employed {
    private String idCarnet, name, lastName;

    public Employed(String idCarnet, String name, String lastName) {
        this.idCarnet = idCarnet;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employed: \n idCarnet=" + idCarnet + ", name=" + name + ", lastName=" + lastName;
    }    
}