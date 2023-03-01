
public class testTeam {
    public static void main(String[] args){
        Team myteam;

        myteam = new Team("THE PEEPS");

        Player p1=new Player(19, "ala", "karl", "Silv");
        Player p2=new Player(330, "al", "patrick", "Bruh");
        Player p3=new Player(-1, "ero", "scottie", "pippens");
        Player p4=new Player(30, "base", "stephen", "curry");
        Player p5=new Player(1, "GoealKeeper", "Stevens", "Michael");

        myteam.addPlayer(p1);
        myteam.addPlayer(p2);
        myteam.addPlayer(p3);
        myteam.addPlayer(p4);
        myteam.addPlayer(p5);

        System.out.println(myteam);


    }
}
