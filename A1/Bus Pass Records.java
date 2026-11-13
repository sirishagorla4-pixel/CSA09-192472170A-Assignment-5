import java.util.*;

public class Main {

    static class BusPass {
        String id, regNo, name, route, stop, date;
        double amount;

        BusPass(String id, String regNo, String name,
                String route, String stop, String date, double amount) {
            this.id = id;
            this.regNo = regNo;
            this.name = name;
            this.route = route;
            this.stop = stop;
            this.date = date;
            this.amount = amount;
        }

        public String toString() {
            return id + " | " + regNo + " | " + name + " | "
                    + route + " | " + stop + " | " + date + " | " + amount;
        }
    }

    public static void main(String[] args) {

        ArrayList<BusPass> passes = new ArrayList<>();

        passes.add(new BusPass(
                "P101", "192472170", "Sirisha",
                "R10", "Main Gate", "31-12-2026", 1500));

        passes.add(new BusPass(
                "P102", "192472171", "Bhavya",
                "R10", "College Gate", "31-12-2026", 1500));

        passes.add(new BusPass(
                "P103", "192472172", "Bhuvana",
                "R20", "Bus Stop", "30-11-2026", 1200));

        System.out.println("ALL BUS PASSES");

        for (BusPass p : passes) {
            System.out.println(p);
        }

        System.out.println("\nFIND PASS P101");

        for (BusPass p : passes) {
            if (p.id.equals("P101")) {
                System.out.println(p);
            }
        }

        System.out.println("\nPASSES ON ROUTE R10");

        for (BusPass p : passes) {
            if (p.route.equals("R10")) {
                System.out.println(p);
            }
        }
    }
}
