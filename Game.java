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
        
        System.out.println("Congratulations on selecting your University!");
        System.out.println("Upon entering your college you're generously given a starting position.");
        System.out.println("A couple months has passed and you have gotten comfortable of how things operate.");
        System.out.println("It's mid-way through the season and you're playing against a rival college.");
              
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
        
        System.out.println("Halfway through the game, the other team is on the fastbreak.");
        System.out.println("You happen to be the only defender in place.");
        
        System.out.println("How do you anticipate the other team?");
        
        System.out.println("[1] Try and predict the pass to get a steal");
        System.out.println("[2] Play it safe and protect the rim");
        
        playIn = UserInput.getInt();
        switch (playIn)
        {
          case 1:
            System.out.println("You try and predict the pass and you successfully steal the ball and score on the fastbreak.");
                
          case 2:
            System.out.println("You attempt to protect the rim but you're overpowered by the other players' talents.");
            ending--;
        }
        
        //Start of scene 3
        
        System.out.println("It's come to the final seconds of your qame.");
        System.out.println("There's 5 seconds on the clock and you have the chance to win it for your team.");
        System.out.println("You have the ball only to be thinking about the game being on the line.");
        
        System.outprintln("What are your final choices?");
        
        System.out.println("[1] Shoot the game winner from half court at where you currently stand with the ball.");
        System.out.println("[2] Move up a litte bit and try to shoot deep 3 over defender.");
        System.out.println("[3] Pass the ball to another player to potentially shoot their own game winner.");
        System.out.println("[4] Put on a show with your dribbles and drive to the rim quickly.");
        
        playIn = UserInput.getInt();
        switch (playIn)
        {
           case 1: 
             System.out.println("You shoot the half court shot and you end up air balling.");
             ending--;
               
           case 2:
             System.out.println("You move up a bit and shoot your deep 3 and you end up making it!");
                
           case 3:
             System.out.println("You pass the ball to your shooting guard only for him to miss his shot.");
             ending--;
                
           case 4:
             System.out.println("You dribble and actually make your defender slip, but time runs out.");
             ending--;
        }
        
        //Start of ending
        
        System.out.println("Depending on your performance, your scout will place you on a particular team.");
          
        System.out.println("[1] If performance was good, you'll be a 1st round pick for a low ranked team.";
        System.out.println("[2] If performance was bad, you'll be drafted by a top notch team like the Warriors.");
        
        ending = UserInput.getInt();
                           
        
    }
}
