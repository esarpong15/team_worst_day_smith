
public class Student implements StudentRequirements {
   private String name;
   private String id;
   private double energy;

   /**
    * Contuctor 
    * @param name The name the user decides to go by
    * @param id The ID of the student / user 
    * @param energy The amount of energy the user says the have as a double
    */
   public Student(String name, String id, double energy) {
      this.name = name;
      this.id = id;
      this.energy = energy;
   }

   /**
    * Accessor
    * @return This will return a string containing a name
    */
   public String getName() {
      return this.name;
   }

   /**
    * Accessor
    * @return This will return a double containing energy level
    */
   public double getEnergy(){
      return this.energy;
   }


}
