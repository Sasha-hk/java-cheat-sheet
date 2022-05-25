# IO methods example

```java
import java.util.Scanner;
import java.io.*;
import lib.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("Main program here");

    System.out.println("Hello Java");

    Scanner reader = new Scanner(System.in);
    System.out.print("Enter a number: ");

    int number = reader.nextInt();

    reader.close();

    System.out.println("You entered: " + number);

    Console cnsl = System.console();
    String rr = cnsl.readLine();

    System.out.println("You enter: " + rr);
  }
}
```
