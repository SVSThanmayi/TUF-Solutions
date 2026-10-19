class Solution {
    public void pattern20(int n) {
        for(int i=1;i<2*n;i++)
        {
            int r=n-Math.abs(n-i);
            for(int j=1;j<=r;j++)
            {
                System.out.print("*");
            }
            for(int j=2*(n-r);j>0;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=r;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}