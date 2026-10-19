class Solution {
    public void pattern22(int n) {
        for(int i=0;i<2*n-1;i++)
        {
            int r=Math.abs(n-i-1)+1;
            for(int j=0;j<2*n-1;j++)
            {
                int c=Math.abs(n-j-1)+1;
                System.out.print(Math.max(r,c)+" ");
            }
            System.out.println();
        }
    }
}