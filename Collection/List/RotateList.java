package Collection.List;

import java.util.*;

public class RotateList {

    public static void rotate(List<Integer> list, int k) {
        int n = list.size();


        k = k % n;


        Collections.reverse(list.subList(0, k));
        Collections.reverse(list.subList(k, n));
        Collections.reverse(list);
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(
                Arrays.asList(10, 20, 30, 40, 50)
        );

        int k = 2;

        rotate(list, k);

        System.out.println("Rotated List: " + list);
    }
}

