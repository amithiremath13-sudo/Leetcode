
class Solution {
    public boolean isPalindrome(int x) {
        
        int dup = x;
        int revNum = 0;
        while(x>0){
            
            int lastdigit;
            lastdigit = x%10;
            x = x/10;
            revNum = (revNum * 10) + lastdigit;


        }
        if(revNum == dup){
            return true;
        }
        else{
            return false;
        }
        
        
        
    }
}