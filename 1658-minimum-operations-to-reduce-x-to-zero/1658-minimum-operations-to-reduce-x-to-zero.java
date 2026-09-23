class Solution {
    public int minOperations(int[] nums, int x) {
        int total=0;
        int curSum=0;
        for(int num : nums){
            total +=num;
        }
        int left = 0;
        int target = total - x;
        int maxLength = -1;
        if(x==total){
            return nums.length;
        } 
        for(int right=0;right<nums.length;right++){
            curSum+=nums[right];
            while(left <= right && curSum>target ){
                curSum-=nums[left];
                left++;
            }
            if(target == curSum){
                maxLength = Math.max(maxLength, right-left+1);
            }
            
        }
        if(maxLength==-1){
            return -1;
        }
        return nums.length-maxLength;
        
    }
}