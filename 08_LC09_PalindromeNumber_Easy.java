class Solution{
    public boolean isPalindrome(int x){
        int ori = x;
        int rev = 0;
        while(ori>0){
            rev =  rev*10 + ori%10;
       c     ori/=10;
        }
        return rev==x;
    }
}
