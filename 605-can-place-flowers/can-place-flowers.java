class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        int count=0;
        int len = flowerbed.length;
        for (int i = 0; i < len; i++) {
            if ((i == 0 || flowerbed[i - 1] == 0) && flowerbed[i] == 0 && (i == len - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }

        }
        if (count >= n)
            return true;
        return false;
    }

}