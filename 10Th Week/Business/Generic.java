public abstract class  Generic {

   private String name, lastname;
   private int age;

   public Generic(String name, String lastname, int age) {
    this.name = name;
    this.lastname = lastname;
    this.age = age;
    }

    public abstract int salary();
}
