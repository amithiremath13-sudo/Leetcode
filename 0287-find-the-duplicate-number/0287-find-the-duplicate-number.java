class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n+1];
        for(int num: nums){
            freq[num]++;
            if(freq[num]==2){
                return num;
                
            }
        } 
        return 0;       
    }
}