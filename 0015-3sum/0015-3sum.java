class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                //we found the triplet
                if(sum==0){
                    //Add triplet to the list
                    answer.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    //skip duplicate left value 
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    } 
                    //skip duplicate right values
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                }
                //sum is too small
                else if(sum<0){
                    left++;
                }
                //sum is too large
                else{
                    right--;
                }

            }

            

        }
        return answer;
        
    }
}