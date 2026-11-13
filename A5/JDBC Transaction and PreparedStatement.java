public class Main {

    public static void main(String[] args) {

        int balance = 1000;
        int transferAmount = 500;

        System.out.println("Initial Balance: ₹" + balance);

        // Transaction starts
        System.out.println("\nTransaction Started");

        if (balance >= transferAmount) {

            balance = balance - transferAmount;

            System.out.println("₹" + transferAmount +
                    " transferred successfully.");

            System.out.println("Transaction Committed");

        } else {

            System.out.println("Insufficient balance.");

            System.out.println("Transaction Rolled Back");
        }

        System.out.println("Final Balance: ₹" + balance);

        // SQL Injection example
        System.out.println("\nSQL Injection Example");

        String username = "admin";
        String password = "' OR '1'='1";

        String unsafeSQL =
                "SELECT * FROM users WHERE username='" +
                username + "' AND password='" +
                password + "'";

        System.out.println("Unsafe SQL:");
        System.out.println(unsafeSQL);

        // PreparedStatement concept
        String safeSQL =
                "SELECT * FROM users WHERE username=? AND password=?";

        System.out.println("\nSafe PreparedStatement:");
        System.out.println(safeSQL);

        System.out.println(
                "PreparedStatement prevents SQL injection by using parameters.");
    }
}
