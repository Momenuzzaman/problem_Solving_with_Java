public class Find_Minimum_and_Maximum {
    public static void main(String[] args) {

        int[]  array = {10,2,49,34,48,19,100,9,1,99};
        System.out.println(findMax(array));
        System.out.println(findMin(array));
    }

    static int findMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    static int findMin(int[] arr){
        int min = arr[0];

        for(int i = 1; i < arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
