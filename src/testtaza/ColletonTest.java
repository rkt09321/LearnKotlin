package testtaza;

import java.util.ArrayList;

public class ColletonTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("Ram");
        arrayList.add("Govind");
        arrayList.add("Samir");
        arrayList.add("Tom");
        for (String str : arrayList) {
            System.out.print(str+" ");
        }
        reverseOrder(arrayList);
        System.out.println();
        System.out.println("After Reverse");

        for (String str : arrayList) {
            System.out.print(str+" ");
        }

    }

    private static void reverseOrder(ArrayList<String> arrayList) {
        if(arrayList.size()>0){
            String str = arrayList.get(0);
            arrayList.remove(0);
            reverseOrder(arrayList);
            arrayList.add(str);
        }
    }

}
