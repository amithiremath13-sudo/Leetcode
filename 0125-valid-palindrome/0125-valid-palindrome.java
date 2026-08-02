class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        char[] arr = s.toCharArray();
        return checkPalindrome(arr,0,arr.length);
        }
        public boolean checkPalindrome(char[] arr,int i,int n){
            if(i>=n/2){
                return true;
            }
            if(arr[i]!=arr[n-i-1]){
                return false;
            }
            return checkPalindrome(arr, i+1, n);
        }
}