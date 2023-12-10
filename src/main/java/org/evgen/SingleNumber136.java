package org.evgen;

/**
 * XOR used here
 * if a=b then a^b=1 so
 * if nums = 4,1,2,1,2
 * ans=4^1^2^1^2
 * here 2^2 and 1^1 both will be cancel out and 4 is only one so it will not be cancelled out
 */
// https://leetcode.com/problems/single-number/description/
// https://www.youtube.com/watch?v=Rn2nRxQExN0&t=1215s&ab_channel=%D0%A0%D0%B0%D0%B7%D1%80%D0%B0%D0%B1%D1%8B
public class SingleNumber136 {
    public static void run() {
        int[] nums = {1,0,1};
        int res = getSingleNumber(nums);
        System.out.println("Result: " + res);
    }

    public static int getSingleNumber(int[] nums) {
        var res = 0;
        for (int el: nums){
            System.out.println("Res: " + res + ", Num: " + el);
            res = res ^ el;
            System.out.println("Res^Num: " + res);
        }
        return res;
    }

//    public static int getSingleNumber(int[] nums) {
//        var list = Arrays.stream(nums).boxed().collect(Collectors.toList());
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("Begin: " + list);
//            var removed = list.remove(i);
//            System.out.println("After remove " + list);
//            System.out.println("Removed " + removed);
//            if (list.contains(removed)) {
//                System.out.println(removed + " is not unique");
//                list.add(i, removed);
//                System.out.println("After add removed: " + list);
//            } else {
//                System.out.println(removed + " unique");
//                return removed;
//            }
//        }
//
//        return -1;
//    }
}
