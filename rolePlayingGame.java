public class App {

    public static void main (String[] args){
        Grid grid = new Grid(3, 3);

        //String[][] grid = new String[3][3];

        grid.place("X", 1, 1);
        grid.display();

        //Character mainChar = new Character("Mikala", 5, Character.ClassType.ASSASSIN);
        //System.out.println("Character Name: " + mainChar.getName());
        //System.out.println("Character Level: " + mainChar.getLevel());
        //System.out.println("Character attack: " + mainChar.getAttack());

        //Actor actor = new Actor(String name, int level, int hp, int attack, double critPercentage, double expPercentage);
        //Actor opponent = new Actor(String name, int level);
        //actor.getActor();

        //Actor actor1 = new Actor();
        //actor1.setName1("Mikala");
        //System.out.println(actor1.getActor1());

        Character protagonist = new Character("Mikala", 30, "KNIGHT");
        Character imposter = new Character("Julia", 25, "ASSASSIN");
        System.out.println(protagonist.getMainCharClass());
        imposter.setExpPercentage(60);
        protagonist.setExpPercentage(60);
        System.out.println(imposter.getExpPercentage());
        protagonist.attack(imposter);
        }

        
        
}
