package QueueUsingArray;

public class QueueArr {
    int capacity = 5;
    int front = -1;
    int rear = -1;
    String[] q = new String[capacity];

    void add(String st) {
        if (rear == capacity - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        if (rear == -1) {
            front = rear = 0;
        } else {
            rear++;
        }
        q[rear] = st;
    }

    String poll() {
        if (front == -1) {
            System.out.println("Queue Underflow");
            return null;
        }
        String ret = q[front];
        if (front == rear) {
            front = rear = -1; // Queue is now empty
        } else {
            front++;
        }
        return ret;
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(q[i] + " ");
        }
        System.out.println();
    }
}


