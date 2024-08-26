public class HollowButterfly {
    public static void main(String[] args) {
        int n = 5; // You can change this value for a larger or smaller butterfly

        // Upper part of the butterfly
        for (int i = 1; i <= n; i++) {
            // Left half of the butterfly
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Spaces between the two halves
            int spaces = 2 * (n - i);
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }

            // Right half of the butterfly
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower part of the butterfly
        for (int i = n; i >= 1; i--) {
            // Left half of the butterfly
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Spaces between the two halves
            int spaces = 2 * (n - i);
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }

            // Right half of the butterfly
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
