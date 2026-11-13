public class Main {

    public static void main(String[] args) {

        String username = "admin";
        String password = "' OR '1'='1";

        System.out.println("UNSAFE SQL:");

        String unsafe =
                "SELECT * FROM users WHERE username='"
                + username
                + "' AND password='"
                + password
                + "'";

        System.out.println(unsafe);

        System.out.println("\nSAFE PreparedStatement:");

        String safe =
                "SELECT * FROM users WHERE username=? AND password=?";

        System.out.println(safe);

        System.out.println("\nValues are supplied separately.");
        System.out.println("SQL injection is prevented.");
    }
}
