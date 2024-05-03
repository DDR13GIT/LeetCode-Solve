class Solution {
    public void nextPermutation(int[] nums) {
        int pivotPosition = getThePivot(nums);
        if (pivotPosition == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        int nextGreaterIndex = nums.length - 1;
        while (nums[nextGreaterIndex] <= nums[pivotPosition]) {
            nextGreaterIndex--;
        }

        swap(pivotPosition, nextGreaterIndex, nums);

        int reverseStart = pivotPosition + 1;
        int reverseEnd = nums.length - 1;
        while (reverseStart < reverseEnd) {
            swap(reverseStart, reverseEnd, nums);
            reverseStart++;
            reverseEnd--;
        }
    }

    public int getThePivot(int[] nums) {
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    public void swap(int a, int b, int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(start, end, nums);
            start++;
            end--;
        }
    }

}