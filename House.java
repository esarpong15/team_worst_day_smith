public class House extends Building implements HouseRequirements  {
    
    
    public House(String name, String address, int floors, String description){
        super(name, address, floors, description);
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

    public static void main(String[] args) {

    House parsonsHouse = new House("Parsons", "24 Henshaw Ave",4,"Parsons House is a 4 story house, your room is at the ___ on __ floor.\nYou walk inside your room. What would you like to do?");
    parsonsHouse.explore();
}
}
