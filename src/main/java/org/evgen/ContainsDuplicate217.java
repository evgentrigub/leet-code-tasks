package org.evgen;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
    public static void run() {
        var res = containsDuplicate(new int[]{1, 2, 3, 4, 4});
        System.out.println("ContainsDuplicate217 result: " + res);
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int el: nums) {
            if(numsSet.contains(el)){
                return true;
            }
            numsSet.add(el);
        }
        return false;
    }
}
