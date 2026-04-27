// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.ArrayList;


public class Student implements StudentRequirements {
   private String name;
   private String id;
   private double energy;
   private int mood;
   private ArrayList<Item> items;


   public Student(String name, String id, double energy, int mood) {
      this.name = name;
      this.id = id;
      this.energy = energy;
      this.mood = mood;
      this.items = new ArrayList();
   }

   public String getName() {
      return this.name;
   }

   public double getEnergy(){
      return energy;
   }

   public void setEnergy(double energy){
      this.energy = energy;
   }

   /**
     * Allows the user to check their own inventory for items
     * that are already in there plus items they pick up.
     */
   public void checkInventory(){

   }

   /**
     * Lets any objects that the user picks up be added into
     * the established inventory.
     */
   public void addToInventory(){
      
   }

   /**
     * Changes the user's emotions depending on
     * how their needs are doing and certain interactions. 
     */
   public void Emotion(){

   }


   public String toString() {
      return this.name + " ID: " + this.id + " Energy: " + this.energy + " Mood : " + this.mood;
   }

   public static void main(String[] args) {
   Student character = new Student("Megan Thee Stallion","123abc",100.0,50);
   System.out.println(character);
   }
}
