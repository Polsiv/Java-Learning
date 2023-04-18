public abstract class Fish extends Animal{

private String Atomosphere;

    public String getAtomosphere() {
        return Atomosphere;
    }

    public void setAtomosphere(String atomosphere) {
        Atomosphere = atomosphere;
    }

    @Override
    public String Info() {
        return "yo glu glu glu";
    }

}
