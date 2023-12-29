public class Binary_Search {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        int key = 9;
        int left = 0, right = array.length -1, middle;


        while (left <= right){
            middle = (left + right) / 2;
            if(array[middle] == key){
                System.out.println("Item found at index at " + middle);
                return;
            }
            else if( array[middle] < key){
                left = middle + 1;
            }
            else {
                right = middle - 1;
            }
        }
        System.out.println("Item not found in the array");
    }
}
