class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] numsNew = new int[n];
        int rotationIndex = (n - k % n) % n;
        int j = 0;

        if (n > 1 && k > 0) {
            for (int i = rotationIndex; i < n; i++) {
                numsNew[j++] = nums[i];
            }
            for (int i = 0; i < rotationIndex; i++) {
                numsNew[j++] = nums[i];
            }
            for (int i = 0; i < n; i++) {
                nums[i] = numsNew[i];
            }
        }
    }
}
