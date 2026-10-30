class Solution {
    public int[] divisors(int n) {
        int[] arr=new int[n];
        int j=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                arr[j]=i;
                j++;
            }
        }
        return Arrays.copyOf(arr,j);
    }
}