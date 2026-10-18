class Solution {
    public void pattern17(int n) {
        for(int i=1;i<=n;i++)
        {
            char ch='A';
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            System.out.print(ch);
            for(int j=1;j<i;j++)
            {
                ch=(char)(ch+1);
                System.out.print(ch);
            }
            for(int j=1;j<i;j++)
            {
                ch=(char)(ch-1);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}