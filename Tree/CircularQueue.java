package Tree;

class CircularQueue {

    TreeNode[] arr;
    int capacity, front = 0, rear, size = 0;

    CircularQueue(int capacity) {
        arr = new TreeNode[capacity];
        this.capacity = capacity;
        rear = -1;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    void enQueue(TreeNode ob) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = ob;
        size++;
    }

    TreeNode deQueque() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return null;
        }

        TreeNode ob = arr[front];
        front = (front + 1) % capacity;
        size--;
        return ob;
    }
}
