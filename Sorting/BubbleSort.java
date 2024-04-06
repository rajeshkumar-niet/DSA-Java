import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number of elements is array: ");
        int n = sc.nextInt();
        int i ,j ;
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for ( i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The array before sorting : ");
        for(i = 0 ; i<n;i++){
            System.out.print(arr[i] + " ");
        }

        //  Bubble Sort Code
        for(i = 0 ; i<n-1; i++){
            for(j = 0 ;j<n-1-i ;j++){
                if(arr[j]>arr[j+1]){
                    if(arr[j]>arr[j+1]){
                        //                        swap
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
        System.out.println();
        System.out.print("The array after sorting : ");
        for(i = 0 ; i<n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}