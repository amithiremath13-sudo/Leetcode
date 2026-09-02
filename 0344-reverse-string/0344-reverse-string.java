class Solution {
    public void reverseString(char[] s) {
        //use the two pointers technique
        int left=0;
        int right = s.length-1;
        while(left<right){
            //swap first and last
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            //move pointers
            left++;
            right--;
        }
        
        
    }
}