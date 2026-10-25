class Solution {
    public int factorial(int n) {
        int prod=1;
        for(int i=n;i>0;i--)
        {
            prod*=i;
        }
        return prod;
    }
}