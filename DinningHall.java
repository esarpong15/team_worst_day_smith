public class DinningHall implements DinningHallRequirements{
    /**
    * This method would let the user/character eat the food item of their choice 
    * @param foodItem : The string of the food item they will be eating. Likely established by us and not the user but dependent. May be a choice the user gets to make
    */
    public void eatFood(String foodItem){

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

    }
}