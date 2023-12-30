public class Find_duplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 7, 8, 8, 9,9};

        boolean hasDuplicates = findAndPrintDuplicates(array);

        System.out.println("Has duplicates: " + hasDuplicates);
    }

    public static boolean findAndPrintDuplicates(int[] array) {
        boolean hasDuplicates = false;

        System.out.print("Duplicate elements: ");

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    hasDuplicates = true;
                    System.out.print(array[i] + " ");
                }
            }
        }

        System.out.println();

        return hasDuplicates;
    }
}
