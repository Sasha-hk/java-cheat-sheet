package lib;
import java.io.*;
import org.json.*;
import java.util.Scanner;

public class Database {
  private File databaseFile;
  private String pathToDatabase;

  public Database(String pathToDatabase) throws Exception {
    File databaseFile = new File(pathToDatabase);

    this.pathToDatabase = pathToDatabase;
    this.databaseFile = databaseFile;

    if (!this.databaseFile.exists()) {
      try {
        this.databaseFile.createNewFile();
      } catch (IOException e) {
        System.out.println("Something went wrong...");
        throw e;
      }
    }
  }

  public void write(JSONArray json) throws Exception {
    String jsonString = json.toString();

    BufferedWriter writer = new BufferedWriter(new FileWriter(this.pathToDatabase));
    writer.write(jsonString.toString());
    writer.close();
  }

  public JSONArray read() throws Exception {
    String result = "";
    BufferedReader br = new BufferedReader(new FileReader(this.pathToDatabase));

    String st;

    while ((st = br.readLine()) != null) {
      result += st;
    }

    br.close();

    JSONArray json = new JSONArray(result);

    return json;
  }

  public void selectOption() throws Exception {
    System.out.println("Select option:");
    Scanner reader = new Scanner(System.in);

    int choice;

    while (true) {
      System.out.println(" 1 - show database");
      System.out.println(" 2 - create record");
      System.out.println(" 3 - exit");
      System.out.print(" > ");

      choice = reader.nextInt();

      if (choice > 0 && choice - 1 <= 2) {
        switch (choice) {
          case 1: {
            this.showDatabase();
            break;
          }
          case 2: {
            this.createRecord();
            break;
          }
          case 3: {
            System.exit(0);
          }
        }
      }
    }
  }

  public void createRecord() throws Exception {
    Database db = new Database(this.pathToDatabase);
    JSONObject newRecord = new JSONObject();
    Console cnsl = System.console();

    System.out.print("Medical card number: ");
    newRecord.put("medicalCardNumber", cnsl.readLine());
    System.out.print("Full name: ");
    newRecord.put("Full name", cnsl.readLine());
    System.out.print("Blood type: ");
    newRecord.put("bloodType", cnsl.readLine());
    System.out.print("Birth year: ");
    newRecord.put("birthYear", cnsl.readLine());

    JSONArray jsonArray = this.read();

    jsonArray.put(newRecord);

    this.write(jsonArray);
  }

  public void showDatabase() throws Exception {
    JSONArray json = this.read();

    for (int i = 0; i < json.length(); i++) {
      System.out.println("\n" + (i + 1) + ".");
      System.out.println(json.get(i));
    }
  }
}
