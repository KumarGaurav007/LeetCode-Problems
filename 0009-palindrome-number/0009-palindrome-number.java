class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0 ,temp =0, org = x;
        while(x>0){
            temp = x%10;
            rev = rev*10 + temp;
            x = x/10;

        }
        if (org == rev){
            return true;
            
        }
        else{
            return false;
        }
    }
}