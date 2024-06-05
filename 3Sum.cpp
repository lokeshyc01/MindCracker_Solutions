class Solution {
public:
    vector<vector<int>> result;
    void twosum(int target,vector<int>& nums,int i,int j){

        while(i < j){
            if(nums[i] + nums[j] > target){
                j--;
            }
            else if(nums[i] + nums[j] < target){
                i++;
            }
            else
            {
                while(i < j && nums[i] == nums[i+1]) i++;
                while(i < j && nums[j] == nums[j+1]) j++;
                result.push_back({-target,nums[i],nums[j]});
                i++;
                j--;
            }
        }
    }

    vector<vector<int>> threeSum(vector<int>& nums)
    {
        if(nums.size() < 3){
            return {};
        }
        result.clear();
        // sort array
        sort(begin(nums),end(nums));
        int target = 0;
        for(int i = 0; i < nums.size()-2;i++)
        {
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int n1 = nums[i];
            int target = -n1;
            twosum(target,nums,i+1,nums.size()-1);
        }
        return result;
    }
};