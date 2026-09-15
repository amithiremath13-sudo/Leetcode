class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i]=0;
            }
        }
        //When all digits are 9. for ex: [9,9,9]
        int[] result = new int[digits.length+1];
        //All indexes are initialised with 0 automatically when we create an array 
        result[0] = 1;
        return result;
    }
}