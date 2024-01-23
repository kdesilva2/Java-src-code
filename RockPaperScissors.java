import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
 

  //This generates random numbers when the method is called

  /*
   @return rannumb random number stored in variable
   */
    public static int random(){

        Random randomNumbers = new Random();

        int rannumb = randomNumbers.nextInt(3)+1;

        return rannumb;

    }
    
    // This is only executed when the method is called and it returns a string
    /*
     @param int ran the number that will be used to determine which decision
     @return rock for number 1
     @return paper for number 2
     @return scissors for number 3
     @return excep if a number wasnt generated
     */
    public static String compRandom(int ran){

        String execp ="A number has not been generated";
//When the number 1 generates it returns rock
        if(ran == 1){

         return "rock";
    
            }
            //When the number 2 generates it returns paper
            else if(ran== 2){
    
                return "paper";
    
            }
            //When the number three generates it returns scissors
            else if(ran == 3){
    
                return"scissors";
    
            }
            //when an error occured and the random number hasnt been called
            else{

                return execp;

            }

    }



//The is the main 
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("You will play against a computer.");

        String comp1;
        String userinput;

        boolean wins = true;

      
       //The loop only stops when the user wins or loses or the comp wins or loses
        while(wins){

          comp1 = compRandom(random());
    
            System.out.println("Choose rock, paper, or scissors");
            userinput = keyboard.nextLine();
          

            //The switch statement converts to numbers when the user types in rock(1) paper(2) or scissors(3)

        switch(userinput){
            //When the user types in rock
            case "rock":
            case "Rock":
            case "ROCK":
            System.out.println("Its the computer's turn and it chooses: ");
            System.out.println(comp1);
            winTieLose(userinput, comp1);

            break;

            //When the user types in paper
            case "paper":
            case "Paper":
            case "PAPER":
            System.out.println("Its the computer's turn and it chooses: ");
            System.out.println(comp1);
            winTieLose(userinput, comp1);
           
            break;

            //When the user types in scissors
            case "scissors":
            case "Scissors":
            case "SCISSORS":
            System.out.println("Its the computer's turn and it chooses: ");
            System.out.println(comp1);
            winTieLose(userinput, comp1);
          
            break;

       //When the user types in something other than rock paper or scissors
            default:
            System.out.println("Please type in rock, paper, or scissors only");
            break;
        }
    }
//This closes the scanner 
        keyboard.close();
    }
/*This method determines if the user lost or won and it exits the loop when win or lose is displayed
 and when tie is displayed the loop continues until the user gets a win or lose  */
 /*
  @param user input
  @param comp input

  */

    public static void winTieLose(String user, String comp){

//when the user types in rock these are the possible outcomes
      if(user.equalsIgnoreCase("rock")){
        

        if (comp.equalsIgnoreCase("scissors")){

          System.out.println("\nYou chose rock and the computer chose scissors...");
          System.out.println("YOU WIN!!!\n");
          
          System.exit(0);
        }
        else if(comp.equalsIgnoreCase("paper")){

          System.out.println("\nYou chose rock and the computer chose paper...");
          System.out.println("You lose!!!\n");
          System.exit(1);
        }
        else{

          System.out.println("Tie. Try again");
          compRandom(random());
          
        }
      }

      //if the user types in paper possible outcomes
      else if(user.equalsIgnoreCase("paper")){


        if(comp.equalsIgnoreCase("scissors")){

          System.out.println("\nYou chose paper and the computer chose scissors...");
          System.out.println("YOU LOSE!!!\n");

          System.exit(2);
        }
        else if(comp.equalsIgnoreCase("rock")){
          System.out.println("\nYou chose paper and the computer chose rock...");
          System.out.println("YOU WIN!!!\n");
          System.exit(3);
        }
        else{

          System.out.println("Tie. Try again");
          compRandom(random());
          

        }

      }
      //If the user types in scissors these are the possible outcomes
      else if(user.equalsIgnoreCase("scissors")){


        if(comp.equalsIgnoreCase("rock")){
          System.out.println("\nYou chose scissors and the computer chose rock...");
          System.out.println("YOU LOSE!!!\n");
          System.exit(4);
        }
        else if(comp.equalsIgnoreCase("paper")){

          System.out.println("\nYou chose scissors and the computer chose paper...");
          System.out.println("YOU WIN!!!\n");
          System.exit(5);
        }
        else{

          System.out.println("Tie. Try again");

          compRandom(random());
          
        }


      }


    }

}
