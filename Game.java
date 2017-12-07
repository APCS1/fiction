public class Game
{
    int playIn = 0;
    int ending = 3;
    
    public static void game()
    {
        AdventureBegin AdventureBeginObject = new AdventureBegin();
        AdventureBegin.adventureBegin();
        scene1();
    }  
    
    public static void scene1()
    {
        System.out.println("Congratulations on selecting your University.");
        System.out.println("Upon entering your college they generously give you a starting position.");
        System.out.println("Couple months has passed you have gotten comfortable of how things operate.");
        System.out.println("It's mid way through the season and you're playing against a rival college.");
              
        System.out.println("Tip off starts and you receive the ball. What do you do?");
             
        System.out.println("[1] Pass the ball to another teammate");
        System.out.println("[2] Pop the 3 pointer");
        System.out.println("[3] Drive in to the rim");
              
        playIn = UserInput.getInt();
        switch (playIn) 
        {
          case 1:
            System.out.println("You pass the ball to a teammate and he successfully scores.");
                          
          case 2: 
            System.out.println("You shoot the 3 pointer and it misses.");
            ending--;
          case 3: 
            System.out.println("You drive in to the rim and the opposing defender pokes the ball out of your hand");
            System.out.println("Resulting in a turnover.");
            ending --;
        }
              
    }
}
