class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxLength = 0;
        int zeros = 0;
        for(int right = 0;right<nums.length;right++){
            //Add the new element to the window
            if(nums[right] ==0){
                zeros++;
            }
            //window is invalid
            while(zeros>k){
                if(nums[left]==0){
                    zeros--;
                }
                left++;
            }
            //length of the substring with maximum k zeros 
            //window is valid
            maxLength = Math.max(maxLength,right - left + 1);
        }
        return maxLength;
        
    }
}