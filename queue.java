
public class queue {
    public static void main(String[] args) {
        queue list = new queue();
        list.enque(12);
        list.enque(45);
        list.enque(60);
        list.enque(30);
        list.display();

    }

    class node {
        node prev;
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    void deque() {
        front = front.next;
    }

    node front = null;
    node rear = null;

    void enque(int data) {
        node newnode = new node(data);

        if (front == null) {

            front = rear = newnode;
        } else {
            rear.prev = rear;
            rear.next = newnode;
            rear = newnode;
        }

    }

    void display() {
        node temp = rear;
        while (temp != front) {
            System.out.println(temp.data);
            temp = temp.prev;
        }

    }

}
