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
            return "Student of the Year! You took notes and even had time to be fancy with them. Let's head home now to revise! ";
        } 
            if (options.equals("B")){
            return "You played! You fell asleep the whole period and didn't wake up until a facilities worker came into the room to fix the A/C. Discombobulated, you head back home.";
            }
            else {
            return "That wasn't an option, let's try that again..";
        }
    }

    public String headToClassRegardless(String options){
        if (options.equals("A")) {
            return "Great, you and Stoner get along and get the first part of the assignment done, Err hovering over your table and all.";
        } 
            if (options.equals("B")){
            System.out.println("Yikes, your ears feel like they're about to fall off. You have to schedule another meeting during dinner to reconvene and actually LOCK IN.");
            return "You know it's going to be a short turnaround before dinner starts, so you try to get some of your homework done at your dorm. Everything is going well until you find out that you have Proofs due at 11:59 pm. You try really hard to finish it, but are contemplating up emailing the professor for an extension. You still have to finish that final group project with all your might. ";
            }
            else {
            return "That wasn't an option, let's try that again..";
        }
    }

    public String lockedIn(String options){
        if (options.equals("A")) {
            return "Nope. Nope. NOPE. I'm not dealing with this right now, it's an issue for dinner. ROUND UP THOSE TEAMMATES AND HEAD TO THE DININGHALL!";
        } 
            if (options.equals("B")){
            return "Merge Conflicts are our friends, let’s fix it! You end up staying a little bit later than expected with Err and resolve all the conflicts. You all head to dinner to finish the final part of the project.";
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