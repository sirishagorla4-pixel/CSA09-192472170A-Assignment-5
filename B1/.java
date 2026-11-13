import java.io.*;
import java.nio.file.*;

public class Main {

    static Path file = Paths.get("buspasses.txt");

    public static void add(String id, String regNo,
                           String name, String route,
                           String amount) throws IOException {

        String record = id + "," + regNo + "," +
                        name + "," + route + "," + amount;

        Files.writeString(
                file,
                record + System.lineSeparator(),
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        );
    }

    public static String[] find(String passId) throws IOException {

        try (BufferedReader r =
                 Files.newBufferedReader(file)) {

            String line;

            while ((line = r.readLine()) != null) {

                String[] fields = line.split(",", -1);

                if (fields.length != 5) {
                    continue;
                }

                if (fields[0].equals(passId)) {
                    return fields;
                }
            }
        }

        return null;
    }

    public static void main(String[] args) throws Exception {

        // Add valid records
        add("P101", "192472170", "Sirisha", "R10", "1500");
        add("P102", "192472171", "Bhavya", "R20", "1200");

        // Add damaged record
        Files.writeString(
                file,
                "DAMAGED_RECORD\n",
                StandardOpenOption.APPEND
        );

        String[] result = find("P101");

        if (result != null) {

            System.out.println("Pass Found");

            System.out.println("Pass ID: " + result[0]);
            System.out.println("Register No: " + result[1]);
            System.out.println("Name: " + result[2]);
            System.out.println("Route: " + result[3]);
            System.out.println("Amount: " + result[4]);

        } else {
            System.out.println("Pass not found");
        }
    }
}
