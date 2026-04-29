public class AcademicHall extends Building implements AcademicalHallRequirements {


    public AcademicHall(String name, String address, int floors, String description){
        super(name, address, floors, description);
    }

    /**
     * Allows student to take notes during class, while doing this
     * it will positively affect their academic standing
     */
    public void takeNotes(Student student){
    double currentEnergy = student.getEnergy();
    student.setEnergy(currentEnergy - 15.0);
    System.out.println("You decided to take notes during class.\nYour grades are eating, but your sleep schedule isnt :/\nEnergy is now: " + student.getEnergy());
    }

    /**
     * Allows student to catch up on sleep during class,
     * while doing this it wont harm their academic standing but it also would 
     * not positively affect it either
     */
    public void sleepInClass(Student student){
    double currentEnergy = student.getEnergy();
    student.setEnergy(currentEnergy + 15.0);
    System.out.println("You decided to sleep during class!\nZzz... Zzz...\nEnergy is now: " + student.getEnergy());
    }

    /**
     * Allows students to skip their class,
     * doing this will harm their academic standing but it
     * it wil increase the fun need.
     */
    public void skipClass(){

    }


    /**
	* This function will be of something that most classes have access to as a function available among classes. This function will allow the user to look around the dinning hall as they choose depending on the choices they have 
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