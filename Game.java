
/**
 * Write a description of class AdventureGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AdventureGame
{
    public static void main(String args[])
    {
        int playIn=0;
        boolean isAlive = true;
        AdventureBegin AdventureBeginObject = new AdventureBegin();
        AdventureBegin.adventureBegin();
        switch (playIn)
        {
            case 1:
                System.out.println("As it turns out, it's a Holy Fire. The weight of your sins burn you alive");
                isAlive = false;
            case 2:
                System.out.println("The key was on a weighted plate. The floor opens up under you, and you fall to your death.");
                isAlive = false;
            case 3:
                System.out.println("The door is locked. Before you get a chance to get the key, it is consumed by the fire. You are burned alive");
                isAlive = false;
            case 4:
                System.out.println("As it turns out, it's actually an intricate painting of a door. You admire its detail for the rest of your life");
                isAlive = false;
            case 5:
                System.out.println("It takes you way too long to realize this room has no windows. You asphixiate shortly afterwards");
                isAlive = false;
            case 6:
                System.out.println("You find empty dorito bags and detect a hint of B.O. and sadness, the calling card of your archnemesis: The Game Master");
                System.out.println("You are so proud to have solved the puzzle, that you forgeet to escape the room");
                isAlive = false;
            case 7:
                System.out.println("God is dead. Now you are too.");
                isAlive = false;
            case 8:
                System.out.println("What? No... You're dead now actually");
                isAlive = false;
            case 9:
                System.out.println("You are very successful");
                isAlive = false;
        }
    }
}
