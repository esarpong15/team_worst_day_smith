// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class Item {
   private String name;


   public Item(String name) {
      this.name = name;
      
   }

   public String getName() {
      return this.name;
   }

   public static void main(String[] args) {
      Item hairbrush = new Item("hairbrush");
      System.out.println(hairbrush);
   }
}
