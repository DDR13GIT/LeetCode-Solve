class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int [] left = new int[size];
        int [] right = new int[size];
        int [] ans = new int[size];

        left[0]=1;
        right[size-1]=1;

        for(int i=1; i<size; i++){
            left[i]= nums[i-1]*left[i-1];
        }
        
        for(int i=size-2; i>=0; i--){
            right[i]= nums[i+1]*right[i+1];
        }

        for(int i =0; i<size; i++){
            ans[i]= left[i]*right[i];
        }
    return ans; 
    }
}