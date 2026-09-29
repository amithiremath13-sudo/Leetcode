class Solution {
    public int jump(int[] nums) {
        int farthest = 0;
        int jumps = 0;
        int currentEnd = 0;
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            farthest = Math.max(farthest,i+nums[i]);
            if(i==currentEnd){
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
        
    }
}