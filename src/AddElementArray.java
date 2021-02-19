import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so can chen: ");
        int input_element = input.nextInt();
        System.out.println("Nhap vi tri can chen: ");
        int input_index = input.nextInt();

        if (input_index >= arr.length-1) {
            System.out.println("Khong chen duoc phan tu vao mang");
        } else {
            for (int i=arr.length-1; i>input_index; i--) {
                arr[i] = arr[i-1];
            }
            arr[input_index] = input_element;
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
        }

    }
}
