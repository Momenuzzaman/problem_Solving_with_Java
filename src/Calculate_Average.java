public class Calculate_Average {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};
        System.out.println(average(array));

    }

    static float average(int[] arr){
        float avg = 0;
        int total = 0;

        for(int i = 0; i < arr.length;i++){
            total += arr[i];
        }
        avg = (float) total / arr.length;
        return avg;
    }
}
