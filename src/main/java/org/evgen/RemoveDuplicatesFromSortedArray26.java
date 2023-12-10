package org.evgen;
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesFromSortedArray26 {
    public int removeDuplicates(int[] nums) {
        var insertIndex = 1; // индекс уникального числа (индекс для вставления)

        // итерируем по массиву
        for (int index = 1; index < nums.length; index++) {
            // если предыдущий и текущий не равны, то производим замену
            if(nums[index] != nums[index - 1]){
                // вместо повторного вставляем текущее значение
                nums[insertIndex] = nums[index];
                // увеличиваем insertIndex (если следующее значение такое же, то опять произойдёт замена)
                insertIndex += 1;
            }
        }

        return insertIndex;
    }
}