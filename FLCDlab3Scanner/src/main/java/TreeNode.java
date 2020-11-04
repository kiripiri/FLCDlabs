class TreeNode {
    public String data;  // data at each node
    public TreeNode left, right;
    public TreeNode(String d) { // construct leaf node
        data = d;
        left = right = null;
    }
}