public class House extends Building implements HouseRequirements  {
    
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

    public String goQuad(String options){
         if (options.equals("A")) {
            System.out.println("You ran all the way to class but you still got bitten. Time to go to the Schacht Center..");
            return "You limped your way to the Schacht Center and asked for a rabies shot… They tell you to wait like 5 minutes. \n You wait 5 minutes and grimace.. The whole waiting room is horrified by you. You get called in finally, and limp your way over to the nurse. They give you the shot but then tell you that you'll have to recover the rest of the day.";
        } 
            if (options.equals("B")){
            return "People walk by and look at you weird. You’ve escaped but at what cost? Your face is flushed as you walk into class and take a seat.";
            }
            else {
            return "That wasn't an option, let's try that again..";
        }
    }

    public String goHome(String options){
         if (options.equals("A")) {
            return "You get some grub, and even have time to catch your friends up on your horrendous morning! Afterwards, you head over to class";
        } 
            if (options.equals("B")){
            return "FAWWK. You overslept because you didn’t set an alarm! Hurry up now get to class!";
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

