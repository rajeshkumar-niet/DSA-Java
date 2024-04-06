import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int i , j, n;
        System.out.print("Enter the length of array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for ( i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The array before sorting : ");
        for(i = 0 ; i<n;i++){
            System.out.print(arr[i] + " ");
        }

        // Insertion Sort Code
        for ( i = 0; i < n-1; i++) {
            int key = i;
            for ( j = i+1 ; j < n; j++) {
                if(arr[key]>arr[j]){
                    key = j;
                }
            }
            //            Swaping elements in sorted order
            int temp = arr[key];
            arr[key] = arr[i];
            arr[i] = temp;
        }
        System.out.println();
        System.out.print("The array after sorting : ");
        for(i = 0 ; i<n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
