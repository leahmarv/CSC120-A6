import java.util.ArrayList;

public class House extends Building {


  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super (name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<>();
    System.out.println("You have built a house: 🏠");
  }

  public boolean hasDiningRoom(){
    if (hasDiningRoom = true) {
      return true;
    } else {
        return false;
    }
  }

  public int nResidents(){
    return residents.size();
  }

  public static void main(String[] args) {
    //new House();
  }

}