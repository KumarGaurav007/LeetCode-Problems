class Solution {
    public int longestConsecutive(int[] nums) {
        
        int maxcount=0;
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        for(int num : set){
            int start=0;
            if(! set.contains(num-1)){
                start = num;
                int count = 1;
                while(set.contains(start+1)){
                    count++ ;
                    start ++;
                }
                maxcount = Math.max(count,maxcount);
                count=0;
            }
        }
        return maxcount;
    }
}