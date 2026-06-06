import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Parul Rana 24CSU292");
        int[] arr = {10, 20, 30, 40, 50};
        int key, low = 0, high = arr.length - 1;
        boolean found = false;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        key = sc.nextInt();

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}

