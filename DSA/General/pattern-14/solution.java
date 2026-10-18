class Solution {
    public void pattern14(int n) {
        for(int i=1;i<=n;i++)
        {
            char ch='A';
            System.out.print(ch);
            for(int j=1;j<i;j++)
            {
                System.out.print((char)(ch+j));
            }
            System.out.println();
        }
    }
}