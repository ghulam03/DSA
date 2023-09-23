//q https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/

 // Function to find k'th smallest element in BST
    // Here count denotes the number of nodes processed so far

      static int count = 0;
    public static Node kthSmallest(Node root, int k)
    {
        // base case
        if (root == null)
            return null;
 
        // search in left subtree
        Node left = kthSmallest(root.left, k);
 
        // if k'th smallest is found in left subtree, return it
        if (left != null)
            return left;
 
        // if current element is k'th smallest, return it
        count++;
        if (count == k)
            return root;
 
        // else search in right subtree
        return kthSmallest(root.right, k);
    }