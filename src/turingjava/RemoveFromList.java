package turingjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveFromList {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(2,3,4,5,6,8,9));
//        Iterator<Integer> itr = integerList.iterator();
//        while (itr.hasNext()) {
//            Integer no = itr.next();
//            if(no%2==0) {
//                itr.remove();
//            }
//        }
        List<Integer> tempList = new ArrayList<>();
        for (Integer integer : integerList) {
            if(integer%2==0) {
                tempList.add(integer);
            }
        }
        integerList.removeAll(tempList);
        for (Integer integer : integerList) {
            System.out.print(integer +" ");
        }
    }
}
