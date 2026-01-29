package Stack_Queue_HashMap.HashMap;

import java.util.HashMap;

class TwoSum {

    public static boolean hasPairWithSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                return true;
            }

            map.put(arr[i], 1);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        System.out.println(hasPairWithSum(arr, target));
    }
}
