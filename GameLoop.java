
import java.util.Scanner;

public class GameLoop {


    public static void main(String[] args) {


        // This will establish a basic boolean on rather or not the game should run or not // 
        boolean gameSwitch = true; 

        // Scanner and storage for response // 
        Scanner userInput = new Scanner(System.in);

        String userResponse = "";

        //Fancy Border formatting
        String fB = "---------------------------------------------------";

        // Establishes the first line the user will see when entering the game and how to start playing the game
        System.out.println("Welcome to our game,\nplease read out instructions");

        System.out.println(fB); 


        // Tells the user what to do in order to play our game properly //
        System.out.println("When playing, you will be given a prompt with options A or B.\nYou are then giving the ability to pick a response, and you can do that by typing either A or B"); 
        
        System.out.println(fB); 

        // Tells you what each option ise and what they do respectivly
        // System.out.println("What would you like to do?");
        // System.out.println("- A : Play\n- B : Quit");

        do {
            // Tells you what each option ise and what they do respectivly
            System.out.println("What would you like to do?");
            System.out.println("- A : Play\n- B : Quit");
            userResponse = userInput.nextLine().toUpperCase();

            if (userResponse.equals("A")){
                System.out.println("Ok, what would you like your name to be?");
                // Scanner nextUserInput = new Scanner(System.in);
                String playerName = userInput.nextLine();
                // PlaceA student constuctor here so the user input still works
                System.out.println("Thank you " + playerName + ". How is your energy today on a scale of 1 - 100. 100 being extremely energized while 1 is completly drained");
                double energy = userInput.nextDouble();
                if (energy >= 1.0 & energy <= 100.0){
                    System.out.println("I see " + playerName +", you're at a " + energy + " energy level today");
                    System.out.println("Lets start your school day");
                    Student StudentPlayer = new Student(playerName, "12345abchehe", energy);
                    System.out.println(fB);
                    System.out.println("Your name is: " + StudentPlayer.getName()+"\nEnergy level: "+ StudentPlayer.getEnergy());
                    System.out.println(fB);
                    System.out.println("You wake up at 8 AM for your 9:25 AM, you're up early!\nYou get dressed and head to the dining hall for breakfast!");
                    System.out.println("Choose your breakfast for the day!");
                    // Interaction 1  // 
                    System.out.println(" - A : Pierogies, Mushy Blueberries, Last Nights Fried Rice\n- B : Baked Cinnamon French toast (Not Fully Cooked), Cold oatmeal, Roasted Carrots");
                    String firstPlayerChoice = userInput.nextLine().toUpperCase();
                    if (firstPlayerChoice.equals("A")){

                    } else if (firstPlayerChoice.equals("B")){

                    } else{

                    } // Could there possibly be some type of while loop you can use to make this work the way it is meant to ?  // 

                    // Interaction 2 // 
                    System.out.println(" - A : Run for your life\n- B : Hide behind the Smith College sign on Elm");
                    // Interaction 3 
                    System.out.println(" - A : \n- B : ");
                    gameSwitch = false;

                } else {
                    System.out.println("Yeah so thats out of range. Im going redirct you to the start so you can undo your mistake");
                    gameSwitch = false;
                }
            } else if (userResponse.equals("B")){
                System.out.println("Ok BYE BYE");
                gameSwitch = false;
            } else{
                System.out.println("Yeah so that wasnt an option. Lets restart");
                //gameSwitch = false;
            } 
            
            // if ((!userResponse.equals("A")) & (!userResponse.equals("B"))){
            //    System.out.println("Yeah so that wasnt an option. Lets restart");
                //gameSwitch = false;
            // }

        } while (gameSwitch);

        userInput.close();
        }
    }


