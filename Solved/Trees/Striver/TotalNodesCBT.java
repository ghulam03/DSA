//q https://leetcode.com/problems/count-complete-tree-nodes/

import java.util.*;

class Node {
  int data;
  Node  left, right;
  Node(int data)
  {
      this.data=data;
      left=null;
      right=null;
  }
}

class TUF{
static int findHeightLeft(Node cur) {
        int hght = 0; 
        while(cur!=null) {
            hght++; 
            cur = cur.left; 
        }
        return hght; 
    }

static int findHeightRight(Node cur) {
        int hght = 0; 
        while(cur!=null) {
            hght++; 
            cur = cur.right; 
        }
        return hght; 
    }

static int countNodes(Node root) {
        if(root == null) return 0; 
        
        int lh = findHeightLeft(root); 
        int rh = findHeightRight(root); 
        
        if(lh == rh) return (1<<lh) - 1; 
        
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);
        
        return 1 + leftNodes + rightNodes; 
    }

public static void main(String args[]) {

  Node root = new Node(1);
  root . left = new Node(2);
  root . right = new Node(3);
  root . left . left = new Node(4);
  root . left . right = new Node(5);
  root . right . left = new Node(6);
  root . right . right = new Node(7);
  root . left . left . left = new Node(8);
  root . left . left . right = new Node(9);
  root . left . right . left = new Node(10);
  root . left . right . right = new Node(11);


  System.out.println("The total number of nodes in the given complete binary tree 
  are: "+countNodes(root));
}
}