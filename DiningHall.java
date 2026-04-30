import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class DiningHall extends Building implements DinningHallRequirements{
    
    
    public DiningHall(String name, String address, int floors, String description){
        super(name, address, floors, description);
    }
    
    /**
    * This method would let the user/character eat the food item of their choice 
    * @param foodItem : The string of the food item they will be eating. Likely established by us and not the user but dependent. May be a choice the user gets to make
    */
    public void eatFood(Student student, String foodItem){
    double currentEnergy = student.getEnergy();
    student.setEnergy(currentEnergy + 20.0);
    System.out.println("You've decided to eat: " + foodItem + ".\nEnergy is now: " +student.getEnergy());
    }


	/**
	* This function will allow the user to take something from the dinning hall. 
	* This item could be something established by us, with them just having the choice to take something at random, or something the user choices 
	* @Return : This will return the item they took along side a string to be printed into the terminal so the user will know what they are taking 
    */
    public String takeSomething(){
        return "To be determained";
    }


    /**
	* this function will allow the user to leave something at the dinning hall
	* @param whatIsLeft : The item the user left behind in the dinning hall, dependent on what user already has on the user
	* @Return : This will return the item the item they left behind, maybe by accident at the dining hall 
    */

	public String leaveSomething(String whatIsLeft){
        return "To be determained";

    }


    /**
	* This function will be of something that most classes have access to as a function available among classes. This function will allow the user to look around the dinning hall as they choose depending on the choices they have 
    */
	public void explore(){
    System.out.println("Description of Location:\n"+this.description);
    }

    public String pickedOptions(String options){
        if (options.equals("A")) {
            return "You chose A: Mmmh Piergoies... said no one ever";
        } 
            if (options.equals("B")){
            return "You chose B: Now why would you willingly choose to have raw food...";
            }
            else {
            return "That wasn't an option, let's try that again..";
        }
    }

public static void playSound(String soundFile) {
        try {
            File file = new File("success.wav");
            if (file.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(file);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start(); // Plays the sound once
                
                // Keep program alive just long enough to play the sound
                // Thread.sleep(clip.getMicrosecondLength() / 1000); 
            } else {
                System.out.println("Audio file not found: " + soundFile);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String headingOver(String options){
        if (options.equals("A")){
            return "You chose A: \nFailure: You open the ice cream lid and find that the ice cream is completely SCRAPED OUT OF BOTH TUBS. Start over?"; 
        } if (options.equals("B")){
            playSound("success.wav"); 
            return "You chose B: \nSuccess: You squeal in all your glory at the sight of TWO FULL TUBS OF GREEN TEA ICE CREAM, even though it wasn't listed on the House Menus page!!!" ; 
        } else{
            return "That wasn't an option, let's try that again..";
        }
    }

public static void main(String[] args) {
    Student character = new Student("Megan Thee Stallion","123abc",100.0);
    DiningHall cutterZiskind = new DiningHall("Cutter/Ziskind Dining", "10 Prospect St, Northampton, MA 01060",4,"Cutter/Ziskind is a dining hall that serves as the primary location for Kosher and Halal dining on campus.\nYou walk inside, What would you like to do?");
    cutterZiskind.explore();
    cutterZiskind.eatFood(character, "Pizza");
    
}
}