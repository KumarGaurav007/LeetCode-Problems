/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> bigList = new ArrayList<>();
        TreeMap<Integer, List<Pair<Integer, Integer> >> map = new TreeMap<>();
        int level = 0;
        int hd = 0;
        helper(root,hd, level, map);
        for (int key: map.keySet()){
            List<Pair<Integer,Integer>> list = map.get(key);
            list.sort((a,b)->a.getKey().compareTo(b.getKey()) == 0 ? a.getValue() - b.getValue() : a.getKey() - b.getKey());
            List<Integer> smallList = new ArrayList<>();
            for(Pair<Integer, Integer> p : list){
                smallList.add(p.getValue());
            }
            bigList.add(smallList);
        }
        return bigList;
    }
    void helper(TreeNode root, int hd, int level, TreeMap<Integer, List<Pair<Integer, Integer> >> map){
        if(root == null){
            return;
        }
        if(!map.containsKey(hd)){
            map.put(hd, new ArrayList<>());
        }
        map.get(hd).add(new Pair(level, root.val));
        helper(root.left, hd-1, level+1, map);
        helper(root.right, hd+1, level+1, map);
    }
}