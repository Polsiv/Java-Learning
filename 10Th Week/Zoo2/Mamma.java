public abstract class Mamma{
    private String name, gender, species;

    public Mamma(String name, String gender, String species) {
        this.name = name;
        this.gender = gender;
        this.species = species;
    }

    //seters===================

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    //getters========================

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getSpecies() {
        return species;
    } 
 

public abstract void pregnancy();
}


