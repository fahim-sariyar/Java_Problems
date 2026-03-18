public class Circular_queue {
    static class Queue {
        static int arr[];
        static int size;
        static int front;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        // ! empty
        public static boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        // ! full method
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // ! add method
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            // ! add first element
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // ! remove method
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            int result = arr[front];
            front = (front + 1) % size;
            // ! last element delete
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // ! peek method
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {

    }
}
