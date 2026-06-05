import java.util.Scanner;

public class ArrayCalc {
    public static void main(String[] args) {
        System.out.println("Parul Rana 24csu292");
        int[] arr = new int[5];
        int sum = 0, altSum = 0;
        int highest, secondHighest;

        Scanner sc = new Scanner(System.in);

        
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];

            if (i % 2 == 0) {
                altSum += arr[i];
            }
        }

        
        highest = secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            if (arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
            } else if (arr[i] > secondHighest && arr[i] != highest) {
                secondHighest = arr[i];
            }
        }

        
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Sum of alternate elements: " + altSum);
        System.out.println("Second highest element: " + secondHighest);
    }
}
