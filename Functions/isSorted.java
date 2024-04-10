import java.util.Scanner;

public class isSorted {
    public static boolean checkSorted(int array[], int idx){
        if (idx == array.length-1) {
            return true;
        }
        if (array[idx]<array[idx+1]) {
            return checkSorted(array, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the element of Array : ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Array is :  ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "  ");
        }
        if (checkSorted(array, 0)) {
            System.out.println("\nArray is sorted ");
        } else{
            System.out.println("\nArray is not sorted ");
        }
        sc.close();
    }
}
