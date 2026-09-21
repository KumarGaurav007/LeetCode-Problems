class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Deque<Integer> st = new ArrayDeque<>();
        int n = nums.length;
        int [] result = new int[n];

        for(int i=2*n-1; i>=0; i--){
            int curr = i % n;
            while(!st.isEmpty() && nums[st.peek()] <= nums[curr]){
                st.pop();
            }
            if(i<n){
                if(!st.isEmpty()){
                    result[curr] = nums[st.peek()];
                }else{
                    result[curr] = -1;

                }
            }
            st.push(curr);
        }
        return result;
    }
}