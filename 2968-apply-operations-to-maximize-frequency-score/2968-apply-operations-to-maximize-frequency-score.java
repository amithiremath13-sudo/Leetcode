class Solution {
    public int maxFrequencyScore(int[] nums, long k) {
        int left =0;
        int answer = 1;
        Arrays.sort(nums);
        int n = nums.length;
        long[] prefixSum = new long[n+1];
        for(int i=0;i<n;i++){
            prefixSum[i+1]= prefixSum[i]+nums[i];
        }
        for(int right=0;right<n;right++){
            while(left<=right){
                //Finding mid
                int mid = left +(right-left)/2;
                long median = nums[mid];
                //calculating left Cost=> cost of making left half equal to median
                long leftSum = prefixSum[mid]-prefixSum[left];
                long leftCount = mid-left;
                long leftCost = median*leftCount- leftSum;
                //Calculating right cost=> cost of making right half equal to median
                long rightSum = prefixSum[right+1]-prefixSum[mid+1];
                long rightCount = right-mid;
                long rightCost = rightSum - median*rightCount;
                //Calculating total cost
                long totalCost = leftCost + rightCost;
                if(totalCost<=k){
                    break;  // window continues
                }
                left++; //new window starts

            }
            answer = Math.max(answer,right-left+1);

        }
        return answer;

        
    }
}