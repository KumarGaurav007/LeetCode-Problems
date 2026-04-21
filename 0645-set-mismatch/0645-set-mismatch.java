class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        int [] arr = new int[2];
        int sum =0;
        int n = nums.length;
        for(int i =0; i<n; i++){
            if(set.contains(nums[i])){
                arr[0]=nums[i];
            }
            set.add(nums[i]);
            sum = sum + nums[i];
        }
        // int maxSum = (n*(n+1))/2;
        // int missing = Math.abs(maxSum - sum - arr[0]);
        // arr[1] = missing;

        for(int i=1; i<=n; i++){
            if(!set.contains(i)){
                arr[1] = i;
                break;
            }
        }
        return arr;

    }
}