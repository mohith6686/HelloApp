public class UC6 {

    public static void main(String[] args) {

        // If no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        String names = "";

        // Enhanced for loop to process arguments
        for (String name : args) {
            names += name + ", ";
        }

        // Remove trailing ", " using substring
        names = names.substring(0, names.length() - 2);

        // Print greeting
        System.out.println("Hello, " + names + "!");
    }
}