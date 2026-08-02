class Solution {
    public int maxSubArray(int[] nums) {
        int maxsub=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            maxsub=Math.max(maxsub,sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxsub;
    }
}