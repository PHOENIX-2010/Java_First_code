package May24;

public class MaxArray {

    int[] arr = {12,23,543,23,45,10001,23,1243,43,23};
    int a = arr[0];

    public void maxvalue(){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>a){
                a = arr[i];
            }
        }
        System.out.println("Max value of the array is: " +a);
    }

    public void minvalue(){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<a){
                a = arr[i];
            }
        }
        System.out.println("Min value of the array is: " +a);
    }

    public static void main(String[] args) {

        MaxArray maxarray = new MaxArray();

        maxarray.maxvalue();
        maxarray.minvalue();
    }
}
