import java.io.File; // Added import for audio
import javax.sound.sampled.*;

public class House extends Building implements HouseRequirements  {
    /**
     * Contructor
     * @param name The name of the house as a string 
     * @param address The address of the house as a string 
     * @param floors The number of floors in the house as a int 
     * @param description Description about the house as a string 
     */
    public House(String name, String address, int floors, String description){
        super(name, address, floors, description);
    }

    public void takeNap(Student student){
    double currentEnergy = student.getEnergy();
    student.setEnergy(currentEnergy + 30.0);
    System.out.println("You took a nap.\nZzz...Zzz...Zzz...\nEnergy is now: "+student.getEnergy());
    }
    
    /**
     * This function will allow the user to take a shower. This function may effect the students emotions and may change to return that emotion later 
     */
    public void takeShower(){

    };
    /**
     * This function will establish that the user is in their room. May cause certain things to apear in the terminal 
     */
    public void inRoom(){

    };

    /**
	* This function will be of something that most classes have access to as a function available among classes. This function will allow the user to look around their house as well as what they can do inside of their house while they are there
    */
    public void explore(){
    System.out.println("Description of Location:\n"+this.description);
    };

    /**
     * This is a method that will be called in game loop in order to print the response corsiponding to the users input. This will happen depending on what happenes after the user possibly gets bit by the rabbid cat 
     * @param options A or B dependin on what the user chooses
     * @return This will return true or false depending on rather the user continues with the game or losses and will have to be asked to restart or not 
     */
    public boolean  goQuad(String options){
        if (options.equals("A")) {
            System.out.println("You chose A: You ran all the way to class but you still got bitten. Time to go to the Schacht Center..\n");
            System.out.println("You limped your way to the Schacht Center and asked for a rabies shot... They tell you to wait like 5 minutes. \nYou wait 5 minutes and grimace.. The whole waiting room is horrified by you. \nYou get called in finally, and limp your way over to the nurse. \nThey give you the shot but then tell you that you'll have to recover the rest of the day.\n");
            System.out.println("***************************************************");
            System.out.println("                   GAME OVER                          ");
            System.out.println("***************************************************\n");
            return false;
        } 
            if (options.equals("B")){
            System.out.println("You chose B: People walk by and look at you weird. You’ve escaped but at what cost? Time to head to class!");
            return true; 
        }else {
            System.out.println("That wasn't an option, let's try that again..");
            return true;
        }
    }

    /**
     * This is used to play sound after certain interactions 
     * @param soundFile The name of the song file
     */
    public static void playSound(String soundFile) {
        try {
            File file = new File("fah.wav");
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

    /**
     * This is a method that will be called in game loop in order to print the response corsiponding to the users input. This will be called depnding on if the user decided to take a nap or get up 
     * @param options A or B dependin on what the user chooses
     * @return This will return a string corresponding to the users choice 
     */
    public String goHome(String options){
         if (options.equals("A")) {
            return "You chose A: You get some grub, and even have time to catch your friends up on your horrendous morning! Afterwards, you head over to class";
        } 
            if (options.equals("B")){
            playSound("fah.wav"); 
            return "You chose B: FAWWK. You overslept because you didn’t set an alarm! Hurry up now get to class!";
            }
            else {
            return "That wasn't an option, let's try that again..";
        }
    
    }
    public static void main(String[] args) {
    
    House parsonsHouse = new House("Parsons", "24 Henshaw Ave",4,"Parsons House is a 4 story house, your room is at the ___ on __ floor.\nYou walk inside your room. What would you like to do?");
    Student character = new Student("Megan Thee Stallion","123abc",100.0);
    parsonsHouse.explore();
    parsonsHouse.takeNap(character);

}
}

