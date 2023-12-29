public class Largest_Element_in_Array {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 30,5, 6, 7, 8, 9, 10};
        System.out.println(maxNumber(array));
    }

    static  int maxNumber(int[] arr){
        int max = arr[0];

        for(int i = 0; i < arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
