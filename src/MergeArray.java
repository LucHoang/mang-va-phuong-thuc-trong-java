import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = new int[2];
        int[] arr3 = new int[arr1.length+arr2.length];

        Scanner input = new Scanner(System.in);

        for (int i=0; i<arr1.length;i++) {
            System.out.println("Arr1 Element "+i+" = ");
            arr1[i] = input.nextInt();
        }
        for (int i=0; i<arr2.length;i++) {
            System.out.println("Arr2 Element "+i+" = ");
            arr2[i] = input.nextInt();
        }

        for (int i=0; i<arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i=arr1.length; i<arr3.length; i++) {
            arr3[i] = arr2[i-arr1.length];
        }

        for (int j = 0; j < arr3.length; j++) {
            System.out.print(arr3[j] + "\t");
        }
    }
}
