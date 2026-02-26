public class kth_level 
{
    public static class Node 
    {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void kthPrint(Node root, int level, int k)             // constroctor
  {
        if (root == null) 
        {
            return;
        }
        if (level == k) 
        {
            System.out.print(root.data + " ");
            return;
        }
        kthPrint(root.left, level + 1, k);
        kthPrint(root.right, level + 1, k);
    }

    public static void main(String[] args)                   // main Class
  {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int k = 3;
        kthPrint(root, 1, k);
    }
}
