class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        set<int>i;
        for(auto &x:nums){
            i.insert(x);}
            return(i.size()!=nums.size());
        
    }
};