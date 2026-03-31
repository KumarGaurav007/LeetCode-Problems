class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int result[] =  new int [temp.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int day=0; day<temp.length; day++){
            while(!stack.isEmpty() && temp[day]>temp[stack.peek()]){
                int prevDay = stack.peek();
                int currDay = day;
                int diff = currDay - prevDay;
                result[prevDay] = diff;
                stack.pop();
            }
            stack.push(day);
        }
        return result;
    }
}