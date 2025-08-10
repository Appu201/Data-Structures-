package AvlTree;

class AvlNode {

    int key;

    int height;

    AvlNode left, right;

    AvlNode(int key) {
        this.key = key;
        this.height = 1; // Initial height of a new node is 1
    }

}
