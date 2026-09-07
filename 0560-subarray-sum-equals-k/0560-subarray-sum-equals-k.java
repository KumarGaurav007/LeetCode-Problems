class Solution {
    public int subarraySum(int[] nums, int k) {
        int count =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixsum = 0;
        map.put(prefixsum,1);
        for(int i=0; i<nums.length; i++){
            prefixsum += nums[i];
            int prevprefix = prefixsum -k;
            if(map.containsKey(prevprefix)){
                count += map.get(prevprefix);
            }
            map.put(prefixsum, map.getOrDefault(prefixsum, 0)+1);

        }
        return count;
    }
}