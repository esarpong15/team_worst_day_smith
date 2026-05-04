
public class Building implements BuildingRequirements {

    protected String name;
    protected String address;
    protected int floors;
    protected String description;

    /**
     * Contructor 
     * @param name name of the building 
     * @param address Adress of the building 
     * @param floors Number of floors in the building 
     * @param description Desciprtion of the building 
     */
    public Building(String name, String address, int floors, String description) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (floors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.floors = floors;
        this.description = description;
    }


    public static void main(String[] args) {
        Building wuertleCenter = new Building("Wuertle Center", "100 Green Street", 2, "blah");
        
    }

}