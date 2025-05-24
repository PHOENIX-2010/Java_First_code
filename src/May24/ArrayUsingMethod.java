package May24;

public class ArrayUsingMethod {

//   int[] arr = {12,23,543,23,45,10001,23,1243,43,23};
    int a = 0;

    public int largestelement(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>a){
                a = arr[i];
            }
        }
        return a;
    }

    public int minimumelement(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<a){
                a = arr[i];
            }
        }
        return a;
    }

    public void printdetail(){
        System.out.println("Max value of the array is: " +a);
        System.out.println("Min value of the array is: " +a);
    }
}
