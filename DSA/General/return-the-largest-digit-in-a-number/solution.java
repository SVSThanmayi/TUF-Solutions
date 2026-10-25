class Solution {
    public int largestDigit(int n) {
        if(n<10)
        return n;
        int max=0;
        while(n>0)
        {
            int rem=n%10;
            if(max<rem)
            max=rem;
            n/=10;
        }
        return max;
    }
}