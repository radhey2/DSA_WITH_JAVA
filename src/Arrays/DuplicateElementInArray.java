package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        int n = arr.size();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(2);
        int res = findDuplicate(arr, n);
        System.out.println(res);
    }

    public static int findDuplicate(ArrayList<Integer> arr, int n) {

        Set<Integer> aset = new HashSet<>();

        for (int i = 0; i <= n - 1; i++) {
            if (aset.contains(arr.get(i))) {
                return arr.get(i);
            } else {
                aset.add(arr.get(i));
            }
        }
        return -1;

    }
}
