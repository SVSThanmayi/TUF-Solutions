class Solution {
    public void pattern15(int n) {
        char ch='A';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print((char)(ch+j));
            }
            System.out.println();
        }
    }
}