import java.util.Scanner;

public class MergeSort {
    public static void conquer(int arr[], int start, int mid, int end) {
        int merger[] = new int[end - start + 1];
        int idx1 = start;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                merger[x++] = arr[idx1++];
            } else {
                merger[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merger[x++] = arr[idx1++];
        }
        while (idx2 <= end) {
            merger[x++] = arr[idx2++];
        }
        for(int i = 0 ,j = start;i<merger.length; i++,j++ ){
            arr[j] = merger[i];
        }
    }

    public static void divide(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conquer(arr, start, mid, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is ");
        for (int i : arr) {
            System.out.println(i);
        }
        divide(arr, 0, n-1);
        System.out.println("The sorted array is ");
        for (int i : arr) {
            System.out.println(i);
        }
        sc.close();
    }
}
