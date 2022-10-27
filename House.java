import java.util.ArrayList;

/* This is a stub for the House class */
public class House extends Building {


  ArrayList<String> residents;
  boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super (name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<>();
    System.out.println("You have built a house: 🏠");
  }

  public static void main(String[] args) {
    //new House();
  }

}