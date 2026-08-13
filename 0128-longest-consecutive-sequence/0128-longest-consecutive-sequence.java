class Solution {
    public int longestConsecutive(int[] nums) {
        // Approach 1 - sorting
        // Arrays.sort(nums);
        // int maxCount = 1;
        // int count = 1;

        // if(nums.length == 0) return 0;

        // for(int i=1; i<nums.length; i++){
        //     if(nums[i] - nums[i-1] == 1){
        //         count++;
        //     }
        //     else if(nums[i] - nums[i-1] == 0){

        //     }
        //     else if(nums[i] - nums[i-1] > 1){
        //         maxCount = Math.max(maxCount, count);
        //         count = 1;
        //     }
        // }
        // maxCount = Math.max(maxCount, count);

        // return maxCount;

        // Approch 2 - using set without sorting

        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxCount = 0;

        for (int num : set) {

            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                while (current != Integer.MAX_VALUE &&
                       set.contains(current + 1)) {
                    current++;
                    count++;
                }

                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }
}