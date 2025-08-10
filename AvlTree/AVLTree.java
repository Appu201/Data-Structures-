package AvlTree;

class AVLTree {

    private AvlNode root;

    // Helper method to get the height of a node
    private int height(AvlNode node) {
        return (node == null) ? 0 : node.height;
    }

    // Helper method to calculate the balance factor of a node
    private int getBalance(AvlNode node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    // Perform a right rotation
    private AvlNode rightRotate(AvlNode y) {
        AvlNode x = y.left;
        AvlNode T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        // Return the new root
        return x;
    }

    // Perform a left rotation
    private AvlNode leftRotate(AvlNode x) {
        AvlNode y = x.right;
        AvlNode T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        // Return the new root
        return y;
    }

    // Wrapper method to insert a key
    public void insert(int key) {
        root = insert(root, key);
    }

    // Insert a key into the AVL tree
    public AvlNode insert(AvlNode node, int key) {
        // Perform normal BST insertion
        if (node == null) {
            return new AvlNode(key);
        }

        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        } else {
            // Duplicate keys are not allowed
            return node;
        }

        // Update the height of the current node
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Get the balance factor to check if the node is unbalanced
        int balance = getBalance(node);

        // Perform rotations to balance the tree

        // Left Left (LL) Case
        if (balance > 1 && key < node.left.key) {
            return rightRotate(node);
        }

        // Right Right (RR) Case
        if (balance < -1 && key > node.right.key) {
            return leftRotate(node);
        }

        // Left Right (LR) Case
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left (RL) Case
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        // Return the node (no rotation required)
        return node;
    }

    // In-order traversal of the AVL tree
    public void inOrder(AvlNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.key + " ");
            inOrder(node.right);
        }
    }

    // Wrapper method for in-order traversal
    public void inOrder() {
        inOrder(root);
        System.out.println();
    }
}
