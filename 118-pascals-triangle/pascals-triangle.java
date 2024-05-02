class Solution {
    public List<List<Integer>> generate(int numRows) {
        List <List<Integer>> ans = new ArrayList<>();
        for(int i = 1 ; i<=numRows; i++){
            ans.add(gererateRow(i));
        }
        return ans;
    }

    public List<Integer> gererateRow (int n){
        List <Integer> ans = new ArrayList<>();
        int prevAns = 1;
        ans.add(1);
        for(int i = 1 ; i < n; i++){
            prevAns = (prevAns * (n-i))/i;
            ans.add(prevAns);
        }
        return ans;
    }
}