class Solution {
    public void pattern10(int n) {
        for(int i=1;i<2*n;i++)
        {
            if(i<=n)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                for(int j=1;j<=n-(i-n);j++)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}