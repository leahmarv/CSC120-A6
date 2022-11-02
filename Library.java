import java.util.Hashtable;

/* This is a stub for the Library class */
public class Library extends Building {

  private Hashtable <String, Boolean> collection;

    public Library() {
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }

    public void addTitle(String title) {
        //TODO Add method
    }

    public String removeTitle(String title) {
        //TODO Add method
    }

    public void checkOut(String title) {
        //TODO Add method
    }

    public void return(String title) {
        //TODO Add method
    }
  
    public static void main(String[] args) {
      new Library();
    }
  
  }