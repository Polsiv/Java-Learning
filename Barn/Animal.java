abstract class Animal {
    private String name, specie;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSpecie() {
        return specie;
    }

    //=============================

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }


    public abstract void SoundEffect();
    
}