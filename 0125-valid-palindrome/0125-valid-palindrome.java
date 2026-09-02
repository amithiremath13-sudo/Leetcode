class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            //remove spaces from left
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            //skip non alphanumeric characters from right
            else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            else{
                //compare characters
                if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                    return false;
                }
                //Move Pointers
                left++;
                right--;
            }
        }
        return true;
        }
}