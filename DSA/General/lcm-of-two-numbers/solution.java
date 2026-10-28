class Solution {
    public int LCM(int n1, int n2) {
        int min=(n1<n2)?n1:n2;
        int max=(n1>n2)?n1:n2;
        int rem=max%min;
        while(rem>0)
        {
            max=min;
            min=rem;
            rem=max%min;
        }
        return (n1/min)*n2;
    }
}