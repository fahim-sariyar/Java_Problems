public class sum_of_nodes   // static class Node
{
    static class Node  
    {
        int data;
        Node left;
        Node right;

        public Node(int data)                      // Constructor
      {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree 
    {
        static int index = -1;

        public Node buildTree(int nodes[]) 
      {
            index++;
            if (nodes[index] == -1) 
            {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);                    // Recursive Call:
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public int sum(Node root) 
      {
            if (root == null)                       // Base Case
                return 0;
            int lsum = sum(root.left);                   // Recursive Part
            int rsum = sum(root.right);
            return (lsum + rsum + root.data);         // Final Return
        }
    }

    public static void main(String[] args)    // main class and Method
  {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);
        System.out.println(bt.sum(root));
    }

}
