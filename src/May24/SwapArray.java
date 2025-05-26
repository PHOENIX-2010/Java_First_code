package May24;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};


        for (int i = 0; i < arr.length/2; i++) {
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
//            System.out.println("After swap the array" +arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("After swap the array" +arr[i]);
        }
    }
}
