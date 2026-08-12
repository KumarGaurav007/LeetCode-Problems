class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int maxCount = 1;
        int count = 1;

        if(nums.length == 0) return 0;

        for(int i=1; i<nums.length; i++){
            if(nums[i] - nums[i-1] == 1){
                count++;
            }
            else if(nums[i] - nums[i-1] == 0){
                
            }
            else if(nums[i] - nums[i-1] > 1){
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }
        maxCount = Math.max(maxCount, count);

        return maxCount;
    }
}