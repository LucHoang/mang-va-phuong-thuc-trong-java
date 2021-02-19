import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 6, 0};

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap phan tu can xoa: ");
        int input_element = input.nextInt();

        int index = 0;
        boolean isExist = false;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == input_element) {
                index = i;
                isExist = true;
                break;
            }
        }

        if (!isExist) {
            System.out.println("Not found " + input_element + " in the list.");
        } else {
            for (int j = index; j<arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
        }

    }
}
