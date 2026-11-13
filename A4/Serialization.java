import java.io.*;

class Resident implements Serializable {

    private static final long serialVersionUID = 1L;

    String name;
    int registerNo;

    transient String password;

    Resident(String name, int registerNo, String password) {
        this.name = name;
        this.registerNo = registerNo;
        this.password = password;
    }
}

public class Main {

    public static void main(String[] args) throws Exception {

        Resident r =
                new Resident("Sirisha", 192472170, "secret123");

        System.out.println("Before Serialization:");

        System.out.println("Name: " + r.name);
        System.out.println("Register No: " + r.registerNo);
        System.out.println("Password: " + r.password);

        System.out.println("\nAfter Serialization Concept:");

        System.out.println("Name: " + r.name);
        System.out.println("Register No: " + r.registerNo);

        System.out.println(
                "Password is transient and is not serialized.");
    }
}
