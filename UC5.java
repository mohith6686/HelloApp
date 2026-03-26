public class UC5 {

    public static void main(String[] args) {

        // Check if no command-line arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Use enhanced for loop (for-each loop)
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        }
    }
}