package May24;

public class MainArrayMethod {
    public static void main(String[] args) {

        int[] arr = {12,23,543,23,45};

        ArrayUsingMethod aum = new ArrayUsingMethod();

        int maxnumber = aum.largestelement(arr);
        System.out.println("Largest number of array is: " +maxnumber);
        int minnumber = aum.smallestelement(arr);
        System.out.println("Smallest number of array is: " +minnumber);


//        aum.largestelement(new int[]{12, 23, 543, 23, 45});
//        aum.smallestelement(new int[]{12, 23, 543, 23, 45});
//        aum.printdetail();
    }
}
