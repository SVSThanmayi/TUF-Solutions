class Solution {
    public boolean isPalindrome(int n) {
        if(n<10)
        return true;
        int rev=0;
        int temp=n;
        while(n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(rev==temp)
        return true;
        return false;
    }
}