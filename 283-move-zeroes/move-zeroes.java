class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length > 1) {
            int l = 0, r = 1;
            while (r < nums.length) {
                if (nums[l] == 0 && nums[r] != 0) {
                    swap(nums, l, r);
                    l++;
                }
                if (nums[l] != 0) {
                    l++;
                }
                r++;
            }
        }
    }
    public void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    public int zeroCount(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (n == 0)
                count++;
        }
        return count;
    }
}