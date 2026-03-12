public class ForLoopBasic {
    public static void main(String[] args) {
        // Basic for loop
        System.out.println("=== Counting ===");
        for (int i = 1; i <= 5; i++) System.out.print(i + " ");
        System.out.println();

        // Countdown
        System.out.println("\n=== Countdown ===");
        for (int i = 10; i >= 1; i--) System.out.print(i + " ");
        System.out.println("🚀");

        // Step
        System.out.println("\n=== Even numbers (step 2) ===");
        for (int i = 2; i <= 20; i += 2) System.out.print(i + " ");
        System.out.println();

        // Multiplication table
        System.out.println("\n=== Multiplication Table (5) ===");
        for (int i = 1; i <= 10; i++)
            System.out.printf("5 × %2d = %3d%n", i, 5 * i);

        // Nested for loops — pattern
        System.out.println("\n=== Star Triangle ===");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) System.out.print("* ");
            System.out.println();
        }

        // Enhanced for-each
        System.out.println("\n=== For-Each Loop ===");
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        for (String fruit : fruits) System.out.println("  → " + fruit);

        // Sum with for loop
        int sum = 0;
        for (int i = 1; i <= 100; i++) sum += i;
        System.out.println("\nSum 1..100 = " + sum);
    }
}
