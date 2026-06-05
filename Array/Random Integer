import java.util.Random;
public class RandonIntegers{
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100); // 0 to 99
        }

        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\nElements at even index:");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\nOdd elements:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println("\n\nElements in reverse order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\nFirst and last element:");
        System.out.println("First: " + arr[0]);
        System.out.println("Last: " + arr[arr.length - 1]);
    }
}
