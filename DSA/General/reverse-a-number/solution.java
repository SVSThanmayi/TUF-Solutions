class Solution {
    public int reverseNumber(int n) {
        if(n<10)
        return n;
        int rev=0;
        while(n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev;
    }
}