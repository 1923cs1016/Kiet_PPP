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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        List<Integer> lst = new ArrayList<>();
        if(root == null)
            return new ArrayList<Integer>();
        qu.add(root);
        while(!qu.isEmpty())
        {
            int size = qu.size();
            TreeNode top = null;
            for(int i = 0; i < size; i++)
            {
                top = qu.poll();
                if(top.left != null) qu.add(top.left);
                if(top.right != null) qu.add(top.right);
            }
            lst.add(top.val);
        }
        
        return lst;
    }
}