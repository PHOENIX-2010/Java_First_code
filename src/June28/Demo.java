package June28;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        for (Integer i : arrayList){
            if (i == 30){
                arrayList.remove(new Integer(30));
            }
        }
        System.out.println(arrayList);
    }
}
