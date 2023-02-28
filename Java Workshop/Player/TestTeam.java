public class TestTeam {
    public static void main (String[] args){
        Team newteam;

        newteam = new Team("Dream Team");

        Player p1 = new Player(1, "Position1", "Karl", "Pepega");
        Player p2 = new Player(2, "Position2", "Patrick", "Silv");
        Player p3 = new Player(3, "Position3", "Tom", "Carter");
        Player p4 = new Player(4, "Position4", "Biyin", "Cancelled");
        Player p5 = new Player(5, "Position5", "Jacob", "Rosseau");

        newteam.AddPlayer(p1);
        newteam.AddPlayer(p2);
        newteam.AddPlayer(p3);
        newteam.AddPlayer(p4);
        newteam.AddPlayer(p5);

        System.out.println(newteam);
    }
}
