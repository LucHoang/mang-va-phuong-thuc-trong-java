public class FindMinValue {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 2, 8, 6, 9, 3};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index] + " index: " + index);
    }

    public static int minValue(int[] array){
        int min = array[0];
        int idx = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                idx = j;
            }
        }
        return idx;
    }
}
