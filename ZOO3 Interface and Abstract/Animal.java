abstract class Animal {
    private String name, specie, gender, Funfact;

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public String getSpecie() {
        return specie;
    }

    public String getGender() {
        return gender;
    }

    public String getFunfact() {
        return Funfact;
    }
    //=============================
    public void setFunfact(String funfact) {
        Funfact = funfact;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public abstract String Info();
    
}