class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> st = new ArrayDeque<>();
        int[] result = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            int curr = nums2[i];
            while (!st.isEmpty() && st.peek() <= curr) {
                st.pop();
            }
            if (st.isEmpty()) {
                map.put(curr, -1);
            } else {
                map.put(curr, st.peek());
            }
            st.push(curr);
        }
        for (int j = 0; j < nums1.length; j++) {
            result[j] = map.get(nums1[j]);
        }

        return result;
    }
}