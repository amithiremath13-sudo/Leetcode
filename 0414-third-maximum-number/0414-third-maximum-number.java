class Solution {
    public int thirdMax(int[] nums) {
        long first_max = Long.MIN_VALUE;
        long second_max = Long.MIN_VALUE;
        long third_max = Long.MIN_VALUE;
        int n = nums.length;
        
        
        for(int i=0;i<n;i++){
            if(nums[i]==first_max || nums[i] == second_max || nums[i] == third_max){
                continue;
            }
            if(nums[i]>first_max){
                third_max=second_max;
                second_max=first_max;
                first_max = nums[i];
            }
            else if(nums[i]> second_max && nums[i]<first_max){
                third_max = second_max;
                second_max = nums[i];
            }
            else if(nums[i]>third_max){
                third_max=nums[i];

            }
        
        }
        return third_max == Long.MIN_VALUE ?(int) first_max :(int) third_max;
        
    }
}