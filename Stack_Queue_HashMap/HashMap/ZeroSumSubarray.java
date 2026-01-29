package Stack_Queue_HashMap.HashMap;

import java.util.HashMap;

class ZeroSumSubarray {

    public static boolean hasZeroSumSubarray(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        map.put(0, 1); // To handle subarray starting from index 0

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If sum already exists → zero sum subarray found
            if (map.containsKey(sum)) {
                return true;
            }

            map.put(sum, 1);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 2, -6};

        System.out.println(hasZeroSumSubarray(arr));
    }
}
