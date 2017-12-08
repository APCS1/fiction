
public class GameBegin
{
    public static void gameBegin()
 
    {
        int playIn= 0;
        
        System.out.println("Congradulations! you're a successful Highschool basketball prospect being scouted by multiple colleges");
        System.out.println("Many respected univiersities would love to have you represent them");
        System.out.println("Whose application would you like to fill out?");
        System.out.println();
        
        System.out.println("[1] Kentucky University");
        System.out.println("[2] Duke University");
        System.out.println("[3] UCLA");
        System.out.println("[4] University of North Carolina");
        System.out.println("[5] University of Kansas");
        
        playIn = UserInput.getInt();
        
        System.out.println("You get denied, you're going to Backupsmore public university instead. ");
        System.out.println();
    }    

}
