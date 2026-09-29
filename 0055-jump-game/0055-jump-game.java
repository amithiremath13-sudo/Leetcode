class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int farthest = 0;
        for(int i=0;i<n;i++){
            if(i>farthest){
                return false;
            }
            int curr = i + nums[i];
            farthest = Math.max(farthest,curr);
            if(farthest>=n){
                return true;
            }

        }
        return true;
        
    }
}