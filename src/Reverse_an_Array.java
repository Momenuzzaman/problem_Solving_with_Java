public class Reverse_an_Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverseArray(array);
    }

    public static void reverseArray(int[] arr) {
        int[] reverseArr = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArr[j] = arr[i];
        }

        System.out.print("Reversed Array: ");
        for (int num : reverseArr) {
            System.out.print( num + " ");
        }
    }
}

