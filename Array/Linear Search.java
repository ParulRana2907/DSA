import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Parul Rana 24CSU292");
        int[] arr = {10, 25, 30, 45, 50};
        int key;
        boolean found = false;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        key = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}
