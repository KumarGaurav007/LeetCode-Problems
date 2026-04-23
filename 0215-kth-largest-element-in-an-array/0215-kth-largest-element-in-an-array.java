class Solution {
    public int findKthLargest(int[] nums, int k) {
        /* Approach 01
        Arrays.sort(nums);
        int r = nums.length-k;
        return nums[r];
        */

        // Approach 02 - without sorting
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i : nums){
            q.add(i);
            if(q.size()>k){
                q.poll();
            }
        }
        return q.peek();
    }  
}