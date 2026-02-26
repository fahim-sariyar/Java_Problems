public class inorder_traverse {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class BinaryTree {
        static int index = -1;

        public Node buildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public void inorderTraverse(Node root) {
            if (root == null) {
                return;
            }
            inorderTraverse(root.left);
            System.out.print(root.data + " ");
            inorderTraverse(root.right);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 6, -1, -1 };
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);
        bt.inorderTraverse(root);
    }
}
