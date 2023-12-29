public class Linear_Search {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int key = 6;

        for (int i = 0; i < array.length; i++){
            if(array[i] == key){
                System.out.println("Item found at index at " + i);
                return;
            }
        }
        System.out.println("Item not found in the array");
    }
}
