class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
    int[] colors = new int[n];
    
    for (int i = 0; i < n; i++) {
        if (colors[i] == 0) {
            // If the helper returns false, a conflict was found -> Not Bipartite
            if (!dfsHelper(i, 1, graph, colors)) { 
                return false; 
            }
        }
    }
    return true;
    }
    boolean dfsHelper(int vertex, int vertexColor, int[][] graph, int []colors){
        colors[vertex ] = vertexColor;
        for(int neighbour:graph[vertex]){
            if(colors[neighbour] == 0){
                int oppositeColor = vertexColor == 1 ? 2 : 1;
                if(!dfsHelper(neighbour,oppositeColor,graph,colors)){
                    return false;
                }
            }
            else if(colors[neighbour] == vertexColor){
                return false;
            }
        }
        return true;

    }
}