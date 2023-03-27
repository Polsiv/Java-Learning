public class main {
public static void main (String[] args){

Cat mycat = new Cat();
mycat.FeedingSchedule("20");
mycat.setMeal("Tuna");
System.out.println(mycat);

System.out.println("--------------------------------------");

Lion myLion = new Lion();
myLion.FeedingSchedule("1");
myLion.setMeal("ME");
System.out.println(myLion);


System.out.println("--------------------------------------");

Wolf myWolf = new Wolf();
myWolf.FeedingSchedule("06");
myWolf.setMeal("Crockies");
System.out.println(myWolf);

System.out.println("--------------------------------------");

Fox myFox = new Fox();
myFox.FeedingSchedule("06");
myFox.setMeal("Crockies");
System.out.println(myFox);

System.out.println("--------------------------------------");

Cow myCow = new Cow();
myCow.FeedingSchedule("9");
myCow.setMeal("Grass");
System.out.println(myCow);

System.out.println("--------------------------------------");

Hippo myHippo = new Hippo();
myHippo.FeedingSchedule("299");
myHippo.setMeal("Apples");
System.out.println(myHippo);

    }
}
