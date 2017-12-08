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
        System.out.println();      
        System.out.println("Tip off starts and you receive the ball. What do you do?");
        System.out.println();     
        System.out.println("[1] Pass the ball to another teammate");
        System.out.println("[2] Pop the 3 pointer");
        System.out.println("[3] Drive in to the rim");
              
        playIn = UserInput.getInt();
        switch (playIn) 
        {
          case 1:
            System.out.println("You pass the ball to a teammate and he successfully scores.");
            break;             
          case 2: 
            System.out.println("You shoot the 3 pointer and it misses.");
            ending--;
            break;
          case 3: 
            System.out.println("You drive in to the rim and the opposing defender pokes the ball out of your hand");
            System.out.println("Resulting in a turnover.");
            ending --;
            break;
               
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
            break; 
          case 2:
            System.out.println("You attempt to protect the rim but you're overpowered by the other players' talents.");
            ending--;
            break;
        }
        
        //Start of scene 3
        
        System.out.println("It's come to the final seconds of your qame.");
        System.out.println("There's 5 seconds on the clock and you have the chance to win it for your team.");
        System.out.println("You have the ball only to be thinking about the game being on the line.");
        System.out.println();
        System.out.println();
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
             break;
               
           case 2:
             System.out.println("You move up a bit and shoot your deep 3 and you end up making it!");
             break;
           case 3:
             System.out.println("You pass the ball to your shooting guard only for him to miss his shot.");
             ending--;
             break;
           case 4:
             System.out.println("You dribble and actually make your defender slip, but time runs out.");
             ending--;
             break;
        }
        
        //Start of ending
        if (ending == 0)
        {
            System.out.println("Your performance in this game has set the tone for the rest of your season.");
            System.out.println("You do not exceed at any aspect of the game and continue to play as a casual individual.");
            System.out.println("It is now draft day and you were the last round pick being drafted to the Golden State Warriors.");
            System.out.println("Upon joining this team, you recieve no playing time and go unoticed");
            System.out.println("eventually leading to your removal from the league.");
        }
        else if (ending > 1 && == 2)
        {
            System.out.println("Your performance in this game has set the tone for the rest of your season.");
            System.out.println("You have been noticed by many recruiters and projected to be a lottery pick in the upcoming draft.");
            System.out.println("It is now draft day and you were the first round pick being drafted to the 76ers.");
            System.out.println("Upon joining this team you have been granted starting position yet again and carried");
            System.out.println("your team to the NBA Championships eventually obtaining your firts ring your rookie year.");
        }   
    }
}
