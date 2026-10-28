class Solution {
    public int GCD(int n1, int n2) {
        int min=(n1<n2)?n1:n2;
        int max=(n1>n2)?n1:n2;
        int rem=max%min,temp=0;
        while(rem>0)
        {
            max=min;
            min=rem;
            rem=max%min;
        }
        return min;
    }
}