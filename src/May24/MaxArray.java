package May24;

public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {12,23,543,23,45,10001,23,1243,43,23};
        int a = arr[0];
//        int b = arr[6];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>a){
                a = arr[i];
            }
        }
        System.out.println("Max value of the array is: " +a);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<a){
                a = arr[i];
            }
        }
        System.out.println("Min value of the array is: " +a);
    }
}
