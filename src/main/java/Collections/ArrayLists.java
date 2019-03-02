package Collections;

import java.util.ArrayList;

public class ArrayLists {


    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> original1, ArrayList<Integer> original2) {
        Integer sum = 0;
        for (Integer i : original1) {
            sum += i;
        }
        for (Integer i : original2) {
            sum += i;
        }
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        ArrayList<Integer> clone = new ArrayList<Integer>(original);
        while (clone.remove(toRemove));
        return clone;
    }
}
