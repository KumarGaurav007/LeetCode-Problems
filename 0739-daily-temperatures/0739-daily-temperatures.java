class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Deque<Integer> st = new ArrayDeque<>();
        int[] result = new int[temp.length];

        for(int i=temp.length-1; i>=0;  i--){
            int curr = temp[i];
            while(!st.isEmpty() && temp[st.peek()] <= curr){
                st.pop();
            }
            if(st.isEmpty()){
                result[i] = 0;
            }
            else{
                result[i] = st.peek()-i;
            }
            st.push(i);
        }
        return result;
    }
}