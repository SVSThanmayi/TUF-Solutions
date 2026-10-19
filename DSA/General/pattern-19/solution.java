class Solution {
    public void pattern19(int n) {
        for(int i=0;i<2*n;i++)
        {
            int r=Math.abs(n-i-(i>=n?0:1))+1;
            for(int j=1;j<=r;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<2*(n-r);j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<r;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}