class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }
        
        int[] inDegree = new int[numCourses];
        for (int[] pre : prerequisites) {
            int a = pre[0];
            int b = pre[1];
            adjList.get(b).add(a);
            inDegree[a]++;
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }
        
        // Fix: Declare and initialize the index variable here
        int index = 0; 
        int[] finalResult = new int[numCourses];
        
        while (!queue.isEmpty()) {
            int course = queue.poll();
            finalResult[index] = course;
            index++;
            
            for (int nextCourse : adjList.get(course)) {
                inDegree[nextCourse]--;
                if (inDegree[nextCourse] == 0) {
                    queue.add(nextCourse);
                }
            }
        }
        
        return index == numCourses ? finalResult : new int[0];
    }
}