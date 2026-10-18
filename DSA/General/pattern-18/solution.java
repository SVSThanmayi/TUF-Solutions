class Solution {
    public void pattern18(int n) {
        char ch='A';
        ch=(char)(ch+n);
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print((char)(ch-j) + " ");
            }
            System.out.println();
        }
    }
}