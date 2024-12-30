class Solution {
    public int removeDuplicates(int[] nums) {
        int currentElement = 0;
        int uniqueIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                currentElement = nums[i];
                nums[uniqueIndex] = currentElement;
                uniqueIndex++;
            } else {
                if (currentElement != nums[i]) {
                    currentElement = nums[i];
                    nums[uniqueIndex] = currentElement;
                    uniqueIndex++;
                }
            }
        }
        return uniqueIndex;
    }
}