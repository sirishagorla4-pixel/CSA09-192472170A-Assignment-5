import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        String data =
                "Student1 Present\n" +
                "Student2 Present\n" +
                "Student3 Absent\n" +
                "Student4 Present\n";

        System.out.println("Attendance Log:");
        System.out.println(data);

        int byteCount = data.getBytes().length;

        System.out.println("Total bytes in log: " + byteCount);

        System.out.println("\nUsing Buffered Processing:");

        BufferedReader reader =
                new BufferedReader(new StringReader(data));

        String line;
        int lines = 0;

        while ((line = reader.readLine()) != null) {
            lines++;
            System.out.println(line);
        }

        reader.close();

        System.out.println("\nTotal attendance records: " + lines);
    }
}
