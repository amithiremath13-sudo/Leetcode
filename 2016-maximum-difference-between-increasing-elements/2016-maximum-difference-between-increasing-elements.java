class Solution {
    public int maximumDifference(int[] nums) {
        int minnum=Integer.MAX_VALUE;
        int maxdiff=-1;
        for(int num:nums){
            if(num<minnum){
                minnum=num;
            }
            else if(num>minnum){
                maxdiff=Math.max(maxdiff,num-minnum);
            }
        }
        return maxdiff;
    }
}