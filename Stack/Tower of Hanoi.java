import java.util.*;

public class TowerOfHanoi {

    // Function to solve Tower of Hanoi
    static void hanoi(int n, char source, char helper, char destination) {
        // Base case
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Step 1: Move n-1 disks from source to helper
        hanoi(n - 1, source, destination, helper);

        // Step 2: Move nth disk
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Step 3: Move n-1 disks from helper to destination
        hanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        int n = 3; // number of disks

        System.out.println("Steps to solve Tower of Hanoi:");
        hanoi(n, 'A', 'B', 'C'); // A = Source, B = Helper, C = Destination
    }
}
