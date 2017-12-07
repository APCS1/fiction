public class Game
{    
    public static void game()
    {
        /** I'm sorry
        * but I don't have the time to get the variables to work between methods
        * I have work from other classes to do tonight as well
        * Just make it into a single method and comment the seperation
        * Already formated it, so just place the story as if it were in diffrent methods between the comments
        * Also, read the read me txt file. I left a message there.
        * Again real sorry
        */
        
        GameBegin GameBeginObject = new GameBegin();
        GameBegin.gameBegin();
        int playIn = 0;
        int ending = 3;
        
        //Start of scene 1
        
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
        
        //Start of scene 2
        
        System.out.println
        //Start of scene 3
        
        //Start of ending
              
    }
}
