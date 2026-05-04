public class AcademicHall extends Building implements AcademicalHallRequirements {

    /**
     * Contrucotr 
     * @param name The name of the acadmic hall 
     * @param address The address of the acadmic hall 
     * @param floors How many floors the acadmic hall has 
     * @param description Desciption regarding the acadmic hall 
     */
    public AcademicHall(String name, String address, int floors, String description){
        super(name, address, floors, description);
    }


    /**
    * Method that contains what will happen depending on what the user choices in the interction. This is given regarding if you want to take notes and focus or go to sleep during class 
    * @param options A or B, which is dependent on the Users input 
    * @return The string regarding what the reaction leads to
    */
    public String goToClass(String options){
        if (options.equals("A")) {
            return "You chose A: Student of the Year! You took notes and even had time to be fancy with them. Let's head home now to revise! ";
        } 
            if (options.equals("B")){
            return "You chose B: You played! You fell asleep the whole period and didn't wake up until a facilities worker came into the room to fix the A/C. Discombobulated, you head back home.";
            }
            else {
            return "That wasn't an option, let's try that again..";
        }
    }

    /**
    * Method that contains what will happen depending on what the user choices in the interction. This is given regarding who the user wants to work with. With one option possiblu being a game over 
    * @param options A or B, which is dependent on the Users input 
    * @return The string regarding what the reaction leads to. With one return being false to signal that game is over
    */
    public boolean  headToClassRegardless(String options){
        if (options.equals("A")) {
            System.out.println("You chose A: Great, you and Stoner get along and get the first part of the assignment done, Err hovering over your table and all.");
            return true;
        } 
            if (options.equals("B")){
            System.out.println("You chose B: Yikes, your ears feel like they're about to fall off and to make matters worst You guys managed to complete NOTHING.\n \n");
            System.out.println("You know it's going to be a short turnaround before dinner starts, so you try to get some of your homework done at your dorm.\nEverything is going well until you find out that you have Proofs due at 11:59 pm. \nSo you spent the rest of the night locking in and submitting that assignment on time.\n \n");
            System.out.println("***************************************************");
            System.out.println("                   GAME OVER                          ");
            System.out.println("***************************************************\n");
            return false;
            }
            else {
            System.out.println("That wasn't an option, let's try that again..");
            return true;
        }
    }

    /**
    * Method that contains what will happen depending on what the user choices in the interction. This is given rather or not you decide to work on a merge conflict or not 
    * @param options A or B, which is dependent on the Users input 
    * @return The string regarding what the reaction leads to
    */ 
    public String lockedIn(String options){
        if (options.equals("A")) {
            return "You chose A: And you're so real for that, lets go to dinner to finish the final part of the project!";
        } 
            if (options.equals("B")){
            return "You chose B: You end up staying a little bit later than expected with Err and resolve all the conflicts. You all head to dinner to finish the final part of the project.";
            }
            else {
            return "That wasn't an option, let's try that again..";
    }
    }



    public static void main(String[] args) {
        AcademicHall seelyeHall = new AcademicHall("Seelye Hall", "Seelye Hall, 2 Seelye Dr #1, Northampton, MA 01060", 4, "This is seelye hall.");
        seelyeHall.explore();
        Student character = new Student("Megan Thee Stallion","123abc",100.0);
        seelyeHall.takeNotes(character);

    }


}