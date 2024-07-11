class Solution {
public:
    bool increasingTriplet(vector<int>& nums) {
        
        int num1 = INT_MAX;
        int num2 = INT_MAX;
        for(int i = 0 ; i < nums.size() ; i++){
            int num3 = nums[i];

            if(num3 <= num1){
                num1 = num3;
            }
            else if(num3 <= num2){
                num2 = num3;
            }
            else {
                return true;
            }
        }

        return false;
    }
};





/*if(n < 3)
            return false;
        
        int left = INT_MAX;
        int mid = INT_MAX;
    
        for(int i = 0; i < n ; i ++)
        {
            if(nums[i] > mid)
                return true;
            
            else if(nums[i] > left && nums[i] < mid)
                mid = nums[i];
        
            else if(nums[i] < left)
                left = nums[i];
        }
        return false;
    }
*/