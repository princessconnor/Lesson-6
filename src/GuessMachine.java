
public class GuessMachine {
   private int number;
   private int numguesses; 
   private int guess;
   
   public GuessMachine(){
    number =(int)(Math.random()*100)+1;
    guess=0;
    numguesses = 0;
    //to do - add methods
    //givehints(), setGuess(), getNumGuesses()
   }
    
     
   
   
   public boolean setGuess(int guesses)
       {
        if (guesses>=1&&guesses<=100)
        {
         numguesses++;
         guess=guesses;
         return true;
        }
        else return false;
       }
    public String giveHint()
   {
       if (guess>number )
       {
           return "too high";
           
       }
       else if (guess<number )
       {
           return "too low ";
       }
       else return " you guessed correctly!";
   }
         public int getNumGuesses()
         {
          return numguesses;   
             
         }
         
        }
           
       
       
       
       

