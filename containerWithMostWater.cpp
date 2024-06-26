class Solution {
public:
    int maxArea(vector<int>& height) {
        int i = 0;
        int j = height.size() - 1;
        int maxWater = 0;
        while(i < j){
            int h = min(height[i],height[j]);
            int w = j - i;
            int area = w * h;
            maxWater = max(maxWater,area);

            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }

        return maxWater;
    }
};