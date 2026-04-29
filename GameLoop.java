
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class GameLoop {


    public static void main(String[] args) {

        // Buildings 
        DiningHall CZ = new DiningHall("Cutter / ziskind", "Middle of campus", 3, "This is the dinning hall cutter ziskind");
        House quad = new House("Quad","Edge of campus", 4, "This is the quad where many students live and tend to sun bath");
        AcademicHall seelye = new AcademicHall("Seelye", "Deep in the academic section of campus", 4, "This is the acadmic hall seelye which holds a lot of humanties classes");
        House dorm = new House("dorm","Edge of campus", 4, "Your home, while your at college. Its cute.");



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
                userInput.nextLine();
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
                    System.out.println("- A : Pierogies, Mushy Blueberries, Last Nights Fried Rice\n- B : Baked Cinnamon French toast (Not Fully Cooked), Cold oatmeal, Roasted Carrots");
                    String firstPlayerChoice = userInput.nextLine().toUpperCase();
                    System.out.println(CZ.pickedOptions(firstPlayerChoice)); 
                    System.out.println(fB);
                    // interaction 2 
                    System.out.println("Yuck! We're sorry for such a tragic breakfast \nAnyways there’s nothing you can do, let's head to class!");
                    System.out.println("Your first class of the day is at Seelye, but you live in [The Quad], time to start your trek!\nUh oh! You were walking and suddenly a RABID CAT jumps out...");
                    System.out.println("- A : Run for your life\n- B : Hide behind the Smith College sign on Elm.");
                    String secondPlayerChoice = userInput.nextLine().toUpperCase();
                    System.out.println(quad.goQuad(secondPlayerChoice));
                    System.out.println(fB);

                    // If the student were to pick a 



                    // Continuing from here as if the picked option B for the function goQuad 
                    System.out.println("You’re at class now and your teacher is yapping up a storm in the front.\nYou look to your left, a student fell asleep.\nYou look to your right, a student is diligently taking notes.\nWhat do you want to do?");
                    System.out.println("- A :  Follow the student on your right and take notes, it’s almost finals season and you lowkey played last semester and can’t risk your GPA anymore.\n- B :  Follow the student on your left, last night was crazy and you were at a Megan Thee Stallion Concert until 3am. It's only right that you catch up on some sleep.");
                    String thirdPlayerChoice = userInput.nextLine().toUpperCase();
                    System.out.println(seelye.goToClass(thirdPlayerChoice));
                    System.out.println(fB);

                    // Interaction 3 
                    System.out.println("You’re at home now, after a tiring morning. It’s 12 PM, so you have an hour before your 1:20 class.");
                    System.out.println("What would you like to do to pass the time");
                    System.out.println("- A :  Try to get some grub at the Dining Hall.\n- B :  Take a quick nap.");
                    String fourPlayerChoice = userInput.nextLine().toUpperCase();
                    System.out.println(dorm.goHome(fourPlayerChoice));
                    System.out.println(fB);

                    // Interaction 4
                    System.out.println("You make it to your 1:20-4:00pm, just a heads up you did have a group final project in this class. Here’s your teammates:\n" + 
                                                "   1. Stoner - Barely shows up to class but always makes sure to do their part in the project.\n" + //
                                                "   2. Gunther - Overly active in the group chat but never actually does anything.\n" + //
                                                "   3. Err (Pronounced Error) - We don’t actually know how they got into this group but we’re vibing.\n" + //
                                                "Who are you sitting next to? (P.S. regardless of the choice Err will be there…)");
                    System.out.println("- A :  You don’t really talk with Stoner but think you have a better chance of completing the assignment with them.\n- B :  Gunther is a great conversationalist, maybe you can convince them to lock in?");
                    String fifthPlayerChoice = userInput.nextLine().toUpperCase();
                    System.out.println(seelye.headToClassRegardless(fifthPlayerChoice));
                    System.out.println(fB);

                    // Interaction 5 
                    System.out.println("Great! Now you’re halfway through the assignment, when unexpectedly… What’s Err doing!\n**Conflict (content): Merge conflict in urMom.md**\nWhen things finally start looking up, there’s now a merge conflict to mess up your day once again.\n");
                    System.out.println("How are we resolving it?");
                    System.out.println("- A :  You don’t really talk with Stoner but think you have a better chance of completing the assignment with them.\n- B :  Gunther is a great conversationalist, maybe you can convince them to lock in?");
                    String sixthPlayerChoice = userInput.nextLine().toUpperCase();
                    System.out.println(seelye.lockedIn(sixthPlayerChoice));
                    System.out.println(fB);

                    // Interaction 6
                    System.out.println("You meet with your group mates at dinner, and the menu for tonight is XXXBeef Straganoff and Heirloom Bean Cassoulet.\n" + //
                                                "You sadly grab yourself a plate of some mysterious meat and head back to the table to join your group members. \n" + //
                                                "You guys managed to finally lock in and finish at 6:45 right before dinner cleanup happens at 7:00. \n" + //
                                                "You walk to the soda machine to grab a drink, when you look to the right of it and see a scoop placed right next to the ice cream freezer. \n" + //
                                                "The label reads: 'Green Tea Icecream'a");
                    System.out.println("Do you take the chance to open it up?");
                    System.out.println("- A :  Try to get some grub at the Dining Hall.\n- B :  Take a quick nap.");
                    String seventhPlayerChoice = userInput.nextLine().toUpperCase();
                    System.out.println(CZ.headingOver(seventhPlayerChoice));
                    System.out.println(fB);

                    // Could there possibly be some type of while loop you can use to make this work the way it is meant to ?  // 

                    // Interaction 2 // 
                    // System.out.println(" - A : Run for your life\n- B : Hide behind the Smith College sign on Elm");
                    // Interaction 3 
                    // System.out.println(" - A : \n- B : ");
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


