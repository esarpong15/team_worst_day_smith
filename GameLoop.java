
import java.util.Scanner;

public class GameLoop {


    public static void main(String[] args) {


        // This will establish a basic boolean on rather or not the game should run or not // 
        boolean gameSwitch = true; 

        // Scanner and storage for response // 
        Scanner userInput = new Scanner(System.in);

        String userResponse = "";


        // Establishes the first line the user will see when entering the game and how to start playing the game
        System.out.println("Welcome to our game,\nplease read out instructions");

        System.out.println("---------------------------------------------------" ); 


        // Tells the user what to do in order to play our game properly //
        System.out.println("When playing, you will be given a prompt with options A or B.\nYou are then giving the ability to pick a response, and you can do that by typing either A or B"); 
        
        System.out.println("---------------------------------------------------" ); 

        // Tells you what each option ise and what they do respectivly
        System.out.println("What would you like to do?");
        System.out.println("- A : Play\n- B : Quit");

        do {
            userResponse = userInput.nextLine().toUpperCase();

            if (userResponse.equals("B")){
                System.out.println("Ok BYE BYE");
                gameSwitch = false;
            }   
            
            if ((!userResponse.equals("A")) & (!userResponse.equals("B"))){
                System.out.println("Yeah so that wasnt an option. Lets restart");
                gameSwitch = false;
            }

            if (userResponse.equals("A")){
                System.out.println("Ok, what would you like your name to be?");
                // Scanner nextUserInput = new Scanner(System.in);
                String playerName = userInput.nextLine();
                // PlaceA student constuctor here so the user input still works
                System.out.println("Thank you " + playerName + ". What kind of mood are you in, on a scale 1-10. 1 being depressed while 10 is over the moon happy");
                int mood = userInput.nextInt();
                if (mood >= 1 & mood <= 10){
                    System.out.println("I see " + playerName +", you're at a " + mood + " number mood today");
                    System.out.println("Lets start your school day");
                    gameSwitch = false;

                } else {
                    System.out.println("Yeah so thats out of range. Im going redirct you to the start so you can undo your mistake");
                    gameSwitch = false;
                }
            }   

        } while (gameSwitch);

        userInput.close();
        }
    }


