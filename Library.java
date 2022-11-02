import java.util.Hashtable;

/* This is a stub for the Library class */
public class Library extends Building {

  private Hashtable <String, Boolean> collection;

    public Library() {
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }

    public void addTitle(String title) {

    }

    public String removeTitle(String title) {

    }

    public void checkOut(String title) {

    }

    public void return(String title) {
  
    }
  
    public static void main(String[] args) {
      new Library();
    }
  
  }