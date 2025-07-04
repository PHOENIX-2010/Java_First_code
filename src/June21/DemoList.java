package June21;

import java.util.ArrayList;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {

        List<Integer> oldlist = new ArrayList<>();
        oldlist.add(10);
        oldlist.add(20);
        oldlist.add(30);
        System.out.println(oldlist.get(1));
        System.out.println(oldlist);
        //oldlist.addFirst(1001);
        System.out.println(oldlist);
        /*oldlist.clear();
        System.out.println(oldlist);*/
        System.out.println(oldlist.indexOf(2));
        System.out.println(oldlist.contains(20));
        System.out.println(oldlist);
    }
}
