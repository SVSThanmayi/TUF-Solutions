class Solution {
    public void pattern13(int n) {
        int a=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(++a + " ");
            }
            System.out.println();
        }
    }
}