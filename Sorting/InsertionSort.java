import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements is array: ");
        int n = sc.nextInt();
        int i, j;
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The array before sorting : ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Insertion Sort Code Here
        for (i = 1; i < n; i++) {
            int current = arr[i];
            j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        System.out.println();
        System.out.print("The array after sorting : ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
