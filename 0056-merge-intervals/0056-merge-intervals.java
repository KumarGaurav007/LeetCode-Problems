class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
       
        for(int [] interval : intervals){
            if(list.isEmpty() || list.get(list.size()-1)[1]<interval[0]){
                list.add(interval);
            }
            else{
               int maxTime = Math.max(list.get(list.size()-1)[1], interval[1]);
                list.get(list.size()-1)[1] = maxTime;
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}