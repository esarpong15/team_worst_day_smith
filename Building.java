public abstract class Building implements BuildingRequirements {

    protected String name;
    protected String address;
    protected int floors;

    /**
     * Adds an item to the building's inventory
     */
    public void addItem(String item) {

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
    public abstract void explore();

    /**
     * Returns the name of the building
     */
    public String getName() {
        return null;
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
}