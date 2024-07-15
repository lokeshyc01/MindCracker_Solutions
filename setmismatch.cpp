class Solution {
public:
    vector<int> findErrorNums(vector<int>& nums) {
        int n = nums.size();
        int duplicate = -1;
        for(int i = 0 ; i<n ; i++){
            if(nums[abs(nums[i]) - 1] < 0){
                duplicate = abs(nums[i]);
            }
            else{

            nums[abs(nums[i]) - 1] *= (-1);
            }
        }

        int missedNumber = -1;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] > 0){
                missedNumber = i+1;
            }
        }

        return {duplicate,missedNumber};
    }
};