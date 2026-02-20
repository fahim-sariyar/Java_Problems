import java.util.*;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        }
        if (root.data < val) {
            // right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // ! print in range
    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.left, k1, k2);
        } else {
            printInRange(root.right, k1, k2);
        }
    }

    // ! root to leaf path
    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }

    public static void rootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        }
        rootToLeaf(root.left, path);
        rootToLeaf(root.right, path);
        path.remove(path.size() - 1);
    }

    // ! valid BST
    public static boolean isValid(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data || max != null && root.data >= max.data) {
            return false;
        }
        return isValid(root.left, min, root) && isValid(root.right, root, max);
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        root = delete(root, 1);
        inorder(root);
        System.out.println();

        printInRange(root, 2, 7);
        System.out.println();

        if (search(root, 1)) {
            System.out.println("FOUND");
        } else {
            System.out.println("NOT FOUND");
        }

        // !print root to leaf
        rootToLeaf(root, new ArrayList<>());

        // ! valid BST
        if (isValid(root, null, null)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
    }
}
