class Solution {
    public void flatten(TreeNode root) {
        if(root == null || (root.left == null && root.right == null))
            return;
        
        List<TreeNode> lst = new ArrayList<>();
        preOrder(root, lst);
        
        root = lst.get(0);
        for(int i = 0; i < lst.size()  - 1; i++)
        {
            root.left = null;
            root.right = lst.get(i + 1);
            root = root.right;
        }
    }
    
    void preOrder(TreeNode root, List<TreeNode> lst)
    {
        if(root == null)
            return;
        lst.add(root);
        preOrder(root.left, lst);
        preOrder(root.right, lst);
    }
}