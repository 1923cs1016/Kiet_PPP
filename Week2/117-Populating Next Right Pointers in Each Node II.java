/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);
        
        while(!qu.isEmpty())
        {
            int size = qu.size();

            Node lastnode = qu.peek();
            for(int i=0;i<size;i++)
            {
                
                Node node = qu.poll();
                if(i>0)
                {
                    
                    lastnode.next = node;
                    lastnode = lastnode.next;
                }
                
                if(node != null)
                {
                    if(node.left != null) qu.add(node.left);
                    if(node.right != null) qu.add(node.right);   
                }
            }
            if(lastnode != null)
                lastnode.next = null;
        }
        
        return root;
    }
}