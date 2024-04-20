class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        reverseArray(citations);
        int hind = 0;
        int count = 0;
        int index = 0;
        int n = citations.length;

        for (int i = n; i > 0; i--) {
            count = 0;
            for (int j : citations) {
                if (j >= i && count<i)
                    count++;
            }
            if (count == i) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // Move towards the center
            start++;
            end--;
        }
    }
}