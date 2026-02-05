package Day17;
import java.util.*;

class Subset {
    public static boolean isSubset(int[] a, int[] b) {

        // Step 1: Store frequency of elements in a[]
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Check elements of b[]
        for (int num : b) {
            if (!map.containsKey(num) || map.get(num) == 0) {
                return false;
            }
            map.put(num, map.get(num) - 1);
        }

        return true;
    }
}

