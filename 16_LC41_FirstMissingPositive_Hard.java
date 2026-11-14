class Solution {
    public int firstMissingPositive(int[] nums) {
       Arrays.sort(nums);
        int count = 1;
        for (int num : nums) {
            if (num == count) count++;
        }
        return count;
    }
}
