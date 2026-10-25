class Solution {
    public int primeUptoN(int n) {
        int count=0;
        for(int i=2;i<=n;i++)
        {
            boolean prime=true;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                prime=false;
            }
            if(prime==true)
            {
                count++;
                System.out.println(i);
            }
        }
        return count;
    }
}