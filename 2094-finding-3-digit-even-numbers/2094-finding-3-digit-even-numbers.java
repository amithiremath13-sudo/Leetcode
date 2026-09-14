class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int n = digits.length;
        Set<Integer> seen = new HashSet<>();
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k = 0;k<n;k++){
                    if(digits[i]==0){
                        continue;
                    }
                    if(i==j||j==k||i==k){
                        continue;
                    }
                    if(digits[k]%2 != 0){
                        continue;
                    }
                    int num = digits[i]*100 + digits[j]*10+digits[k];
                    seen.add(num);
                    

                    
                }
            }
            

            
        }
        int[] arr = new int[seen.size()]; 
        int index = 0; 

        for(int x : seen) { 
            arr[index] = x; 
            index++; 
        }
        Arrays.sort(arr); 

        return arr;
        
    }
}