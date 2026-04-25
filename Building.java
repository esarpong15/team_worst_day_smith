import java.util.ArrayList;

public abstract class Building implements BuildingRequirements {

    protected String name;
    protected String address;
    protected int floors;
    private ArrayList<Items> items;

    public Building(String name, String address, int floors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (floors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.floors = floors;
    }

    /**
     * Adds an item to the building's inventory
     */
    public void addItem(String item) {
        this.items.add("added item(s) from scanner");
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
        return null;
    }

    /**
     * Returns the number of floors in the building
     */
    public int getFloors() {
        return 0;
    }

     public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }
}