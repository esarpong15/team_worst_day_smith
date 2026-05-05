import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class DiningHall extends Building implements DinningHallRequirements{
    
    /**
     * Conructor 
     * @param name The name of the dinningHall 
     * @param address Address of the dinningHall 
     * @param floors The number of floors in the dinningHall 
     * @param description Desciption of the dinning hall 
     */
    public DiningHall(String name, String address, int floors, String description){
        super(name, address, floors, description);
    }
    

    /**
     * This is what will print depending on what the user decided to choose in the interaction. This one is based on what the user/student decides to eat at the dinning hall 
     * @param options A or B deppending on what the user inputs 
     * @return The string of what the interaction leads to 
     */
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

    /**
     * This will play an audio on certain interactions for the user to hear 
     * @param soundFile The name of the sound file 
     */
    public void playSound(String soundFile) {
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

    /**
     * This is the print depending on what the user will choose. This choice is based on if they get ice cream or not. There is a devation in this depending on a privous choice but that is done within the game loop 
     * @param options A or B depending on what the user inputs 
     * @return The print statement 
     */
    public String headingOver(String options){
        if (options.equals("A")){
            playSound("success.wav");
            System.out.println("You chose A: You squeal in all your glory at the sight of TWO FULL TUBS OF GREEN TEA ICE CREAM, even though it wasn't listed on the House Menus page!!!");
            System.out.println(" ");
            System.out.println("***************************************************");
            System.out.println("                   YOU WIN                          ");
            System.out.println("***************************************************\n");
            return " "; 
        } if (options.equals("B")){ 
            System.out.println("You chose B: You wrap up your session with your team mates and head home, sad, wondering where you went wrong");
            System.out.println(" ");
            System.out.println("***************************************************");
            System.out.println("                  YOU LOST                         ");
            System.out.println("***************************************************\n");
            return " "; 
        } else{
            return "That wasn't an option, let's try that again..";
        }
    }

}