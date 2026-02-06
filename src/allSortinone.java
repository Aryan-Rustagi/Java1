import java.util.Scanner;

public class AllSortInOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Selection Sort
        System.out.println("Enter the size of array 1:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr1[minIndex] > arr1[j]) {
                    minIndex = j;
                }
            }
            int temp = arr1[i];
            arr1[i] = arr1[minIndex];
            arr1[minIndex] = temp;
        }

        System.out.println("Selection Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }

        // Insertion Sort
        System.out.println("\n\nEnter the size of array 2:");
        int n1 = sc.nextInt();
        int[] arr2 = new int[n1];

        for (int i = 0; i < n1; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 1; i < n1; i++) {
            int curr = arr2[i];
            int prev = i - 1;

            while (prev >= 0 && arr2[prev] > curr) {
                arr2[prev + 1] = arr2[prev];
                prev--;
            }
            arr2[prev + 1] = curr;
        }

        System.out.println("Insertion Sort:");
        for (int i = 0; i < n1; i++) {
            System.out.print(arr2[i] + " ");
        }

        // Bubble Sort
        System.out.println("\n\nEnter the size of array 3:");
        int n3 = sc.nextInt();
        int[] arr3 = new int[n3];

        for (int i = 0; i < n3; i++) {
            arr3[i] = sc.nextInt();
        }

        for (int i = 0; i < n3 - 1; i++) {
            for (int j = 0; j < n3 - i - 1; j++) {
                if (arr3[j] > arr3[j + 1]) {
                    int temp = arr3[j];
                    arr3[j] = arr3[j + 1];
                    arr3[j + 1] = temp;
                }
            }
        }

        System.out.println("Bubble Sort:");
        for (int i = 0; i < n3; i++) {
            System.out.print(arr3[i] + " ");
        }

        sc.close();
    }
}
