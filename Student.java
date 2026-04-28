// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.ArrayList;


public class Student implements StudentRequirements {
   private String name;
   private String id;
   private double energy;
   private ArrayList<Item> items;


   public Student(String name, String id, double energy) {
      this.name = name;
      this.id = id;
      this.energy = energy;
      this.items = new ArrayList<Item>();
   }

   public String getName() {
      return this.name;
   }

   public double getEnergy(){
      return this.energy;
   }

   public void setEnergy(double energy){
      if (energy > 100.0) {
            this.energy = 100.0;
         } else if (energy < 0.0) {
            this.energy = 0.0;
         } else {
            this.energy = energy;
         }   }

   /**
     * Allows the user to check their own inventory for items
     * that are already in there plus items they pick up.
     */
   public void checkInventory(){
      if (items.isEmpty()) {
         System.out.println("Your bag is empty. You have no items.");
      } else {
         System.out.println("******** Your Inventory ********");
         for (int i = 0; i < items.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + items.get(i).getName());
         }
         System.out.println("********************************");
      }
   }

   /**
     * Lets any objects that the user picks up be added into
     * the established inventory.
     */
   public void addToInventory(Item item){
      items.add(item);
      System.out.println(item.getName() + " has been added to your inventory.");
   }

   /**
     * Changes the user's emotions depending on
     * how their needs are doing and certain interactions. 
     */
   public void Emotion(){

      String emotionMessage;
      
      if (energy >= 70) {
         emotionMessage = "You're feeling energized and in great spirits. Today is going to be a good day!";
      } else if (energy >= 40) {
         emotionMessage = "You're having a neutral day, great things are coming your way!";
      } else if (energy <= 40){
         emotionMessage = "You're feeling exhausted, make sure get some rest!";
      }
   }


   public String toString() {
      return this.name + " ID: " + this.id + " Energy: " + this.energy;
   }

   public static void main(String[] args) {
   Student character = new Student("Megan Thee Stallion","123abc",100.0);
   System.out.println(character);
      
   
   }


}
