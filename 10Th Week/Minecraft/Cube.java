abstract class Cube{
    private String name, texture;
    private int hardness;


    public Cube(String name, String texture, int hardness) {
        this.name = name;
        this.texture = texture;
        this.hardness = hardness;
    }


    
public String getName() {
        return name;
    }



    public String getTexture() {
        return texture;
    }



    public int getHardness() {
        return hardness;
    }

    

public void setName(String name) {
        this.name = name;
    }



    public void setTexture(String texture) {
        this.texture = texture;
    }



    public void setHardness(int hardness) {
        this.hardness = hardness;
    }



public abstract void destroy();

}