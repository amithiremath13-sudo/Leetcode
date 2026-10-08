class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int[] freq = new int[n+1];
        for(int num: nums){
            freq[num]++;
            if(freq[num]==2){
                list.add(num);
            }
            
        }
        return list;
        
    }
}