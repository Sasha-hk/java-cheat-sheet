import lib.*;

public class App {
  public static void main(String[] args) {
    try {
      Database db = new Database("/home/petryk/database.json");

      db.selectOption();
    } catch (Exception e) {
      System.out.println(e.getMessage() + " <<<<<<< ");
    }
  }
}
