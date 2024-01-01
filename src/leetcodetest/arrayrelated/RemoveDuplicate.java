package leetcodetest.arrayrelated;

import java.util.Iterator;
import java.util.TreeSet;

public class RemoveDuplicate {
        public int removeDuplicates(int[] num) {
            TreeSet<Integer> treeSet = new TreeSet<>();
            for(int i:num){
                treeSet.add(i);
            }
            Iterator i = treeSet.iterator();
            int j = 0;
            while(i.hasNext()){
                num[j] = (int)i.next();
                j++;
            }

            return treeSet.size();
        }
}
