import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("JDBC METHODS COMPARISON");

        System.out.println("\n1. Statement");
        System.out.println("Used for simple SQL queries.");

        System.out.println("\n2. PreparedStatement");
        System.out.println("Used for parameterized SQL queries.");
        System.out.println("Provides better security.");

        System.out.println("\n3. Batch Processing");
        System.out.println("Processes multiple operations together.");

        System.out.println("\n4. Transaction");
        System.out.println("Groups multiple operations as one unit.");

        System.out.println("\nRecommended Approach:");
        System.out.println(
                "PreparedStatement + Batch Processing + Transaction");
    }
}
