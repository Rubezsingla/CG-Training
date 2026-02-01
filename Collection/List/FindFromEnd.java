package Collection.List;

import java.util.*;

public class FindFromEnd {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2;

        String result = findNthFromEnd(list, n);
        System.out.println("Nth element from end: " + result);
    }

    public static String findNthFromEnd(LinkedList<String> list, int n) {

        if (n <= 0 || list.size() == 0) {
            return "Invalid input";
        }

        int fast = 0;
        int slow = 0;

        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (fast >= list.size()) {
                return "";
            }
            fast++;
        }

        // Move both pointers
        while (fast < list.size()) {
            fast++;
            slow++;
        }

        return list.get(slow);
    }
}
