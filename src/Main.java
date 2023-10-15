public class Main {
    public static void main(String[] args) {

        // Part A
        // -------------------------------------------------------------------

        System.out.println("1. A loop that counts up by 1 from 0 to 30");
        for (int i = 0; i <= 30; i++) {
            System.out.println("Count: " + i);
        }

        System.out.println("\n2. A loop that counts down by 1 from 30 to 0");
        for (int i = 30; i >= 0 ; i--) {
            System.out.println("Count: " + i);
        }

        System.out.println("\n3. A loop that counts up by 3 from 0 to 18");
        for (int i = 0; i <= 18; i+=3) {
            System.out.println("Count: " + i);
        }

        System.out.println("\n4. A loop that counts down by 2 from 10 to 0");
        for (int i = 10; i >= 0; i-=2) {
            System.out.println("Count: " + i);
        }

        // Part B
        // -------------------------------------------------------------------

        System.out.println("\n5. A nested loop that creates this figure");
        for (int i = 0; i < 5; i++){
            for (int n = 0; n <= i; n++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n6. A nested loop that creates this figure");
        for (int i = 4; i >= 0; i--){
            for (int n = 0; n <= i; n++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n7. A nested loop that creates this figure");
        for (int i = 0; i < 5; i++){
            for (int n = 0; n < 5; n++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Extra Credit
        // -------------------------------------------------------------------

        System.out.println("\nExtra Credit");
        for (int i = 0; i < 4; i++) {
            System.out.print("***");
            for (int n = 5; n > i; n--) {
                System.out.print(" ");
            }
            System.out.print("***");
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            System.out.print("***");
            for (int n = -1; n < i; n++) {
                System.out.print(" ");
            }
            System.out.print("***");
            System.out.println();
        }
    }
}