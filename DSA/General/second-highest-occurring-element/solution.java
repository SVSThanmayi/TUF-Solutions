class Solution {
    public int secondMostFrequentElement(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int n:nums)
       {
            map.put(n,map.getOrDefault(n,0)+1);
       }
       int max=0;
       for(int freq:map.values())
       {
            if(freq>max)
            max=freq;
       }
       int submax=0;
       for(int freq:map.values())
       {
        if(freq<max && freq>submax)
            submax=freq;
       }
       int ans=Integer.MAX_VALUE;
       for(int key:map.keySet())
       {
        if(map.get(key)==submax && key<ans)
        ans=key;
       }
       if(submax==0)
       return -1;
       return ans;
    }
}