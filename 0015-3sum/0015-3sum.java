class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> biglist = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < n-2; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            if(i>0 && nums[i-1] == nums[i]){
                continue;
            }
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                
                if (sum > 0) {
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    List<Integer> list = new ArrayList<>();

                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    biglist.add(list);
                    l++;
                    r--;
                    while(l < r && nums[l-1] == nums[l]){
                        l++;
                    }
                        
                    while(l < r && nums[r+1] == nums[r]){
                        r--;
                    }
                }
            }
        }

        return biglist;
    }
}