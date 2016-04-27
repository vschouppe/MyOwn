package vs.codility.training;



public class Solution {

    public int solution(Tree T) {
        // write your code in Java SE 8
        
        
        
        
        return 1;
    }

    public static void main(String args[]) {

        //Create Tree for testing
        int root = 5;
        Tree tree = new Tree();
        tree.insertNode(tree.root, 5, "");
        tree.insertNode(tree.root, 8, "L");
        tree.insertNode(tree.root, 9, "R");
        tree.insertNode(tree.root, 12, "L");
        tree.insertNode(tree.root, 2, "R");        

        Solution sol = new Solution();
        int result = sol.solution(tree);

    }

    static class Tree {
        
        Node root = new Node(1111);
        
        // insert a left node
        public void insertNode(Node root, int v, String leg) {
            if (root.value == 1111) {
                root.value = v;
            } else {
                if (leg.equalsIgnoreCase("L")) {
                    if (root.left != null) {
                        insertNode(root.left, v, "L");
                    } else {
                        root.left = new Node(v);
                    }
                } else {
                    if (root.right != null) {
                        insertNode(root.right, v, "L");
                    } else {
                        root.right = new Node(v);
                    }
                }
            }

        }
        
        


        static class Node {

            Node left;
            Node right;
            int value;

            public Node(int v) {
                left = null;
                right = null;
                this.value = v;
            }
        }

    }

}
