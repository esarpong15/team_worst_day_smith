
public class Building implements BuildingRequirements {

    protected String name;
    protected String address;
    protected int floors;
    protected String description;


    public Building(String name, String address, int floors, String description) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (floors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.floors = floors;
        this.description = description;
    }


    /**
     * Removes an item from the building's inventory and returns it
     */
    public String removeItem(String item) {
        return null;
    }

    /**
     * Describes the interior of the building and lists any items present
     */
    public void explore(){
        System.out.println("Description of Location:\n"+this.description);
    };

    /**
     * Returns the name of the building
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the address of the building
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Returns the number of floors in the building
     */
    public int getFloors() {
        return this.floors;
    }

    public String toString() {
        return this.name + " is a " + this.floors + "-story building located at " + this.address;
    }




    public static void main(String[] args) {
        Building wuertleCenter = new Building("Wuertle Center", "100 Green Street", 2, "blah");
        
    }

}