class Solution {
    public int mostFrequentElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
            System.out.println(map.get(n));
        }
        int max=0,num=100;
        for(int key:map.keySet())
        {
            if(max<map.get(key))
            {
                max=map.get(key);
                num=key;
            }
            if(max==map.get(key) && num>key)
            {
                num=key;
            }
        }
        return num;
    }
}


