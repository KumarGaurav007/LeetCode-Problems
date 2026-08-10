class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(target-nums[j] == nums[i]){
                    return new int[] {i, j};
                }
            }
        }

        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i =0; i<nums.length; i++){
        //     if(map.containsValue(nums[i])){
        //         if(target - map.get(i) == nums[i]){
        //             return new int[] {nums[i],map.get(i)};
        //         }
        //     }
        //     map.put(1++,nums[i]);

        // }
        return new int[] {-1,-1};
    }
}