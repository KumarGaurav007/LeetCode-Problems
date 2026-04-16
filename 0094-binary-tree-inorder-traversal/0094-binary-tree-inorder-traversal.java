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
    // Approach 1 Recursive
    public List<Integer> recursiveInorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    public void traverse(TreeNode node, List<Integer> list){
        if(node == null){
            return;
        }

        traverse(node.left, list);
        list.add(node.val);
        traverse(node.right, list);
    }
    // Approach 2 Iterative
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        
        while(true){
            if(node!=null){
                stack.push(node);
                node = node.left;
            }
            else{
                if(stack.isEmpty()) break;
                node = stack.pop();
                list.add(node.val);
                node = node.right;
            }
        }
        return list;
    }

    
}