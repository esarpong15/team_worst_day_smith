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
	public void explore(){
    System.out.println("Description of Location:\n"+this.description);
    }

    public static void main(String[] args) {
        AcademicHall seelyeHall = new AcademicHall("Seelye Hall", "Seelye Hall, 2 Seelye Dr #1, Northampton, MA 01060", 4, "This is seelye hall.");
        seelyeHall.explore();
        Student character = new Student("Megan Thee Stallion","123abc",100.0,50);
        seelyeHall.takeNotes(character);

    }


}