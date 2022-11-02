import java.util.Hashtable;

/* This is a stub for the Library class */
public class Library extends Building {

  private Hashtable <String, Boolean> collection;

    public Library() {
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }

    public void addTitle(String title) {
        collection.put(title, true);
    }

    public String removeTitle(String title) {
        collection.remove(title);
    }

    public void checkOut(String title) {
        collection.replace(title, true, false);
    }

    public void return(String title) {
        collection.get(title);
    }
  
    public static void main(String[] args) {
      new Library();
    }
  
  }