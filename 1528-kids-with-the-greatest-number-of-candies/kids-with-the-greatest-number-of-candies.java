class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandy = getMax(candies);

        for(int i : candies){
            if((i+extraCandies)>= maxCandy) result.add(true);
            else result.add(false);
        }
return result;
    }

    public int getMax(int[] arr){
        int max = arr[0];
        for(int i= 1; i<arr.length; i++){
            if(arr[i]> max) max=arr[i];
        }
        return max;
    }
    
}