public class linkedlist {
    /**
     * linkedlist1
     */

    public Node head = null;
    public Node tail = null;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;

        }

    }

    public void addNode(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
        } else {
            tail.next = newnode;
        }
        tail = newnode;
    }

    public void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Empty");
            return;
        }
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void deletenode(int data) {
        Node temp = head, prev = null;

        if (temp.data == data) {
            head = temp.next;
            return;

        }
        while (temp != null && temp.data == data) {
            prev = temp;
            temp = temp.next;

        }
        if (temp == null)
            return;

        if (temp == tail) {
            prev = tail;
            tail.next = null;
            return;
        }
        prev.next = temp.next;

    }

    public void insert(int sel, int data) {
        Node temp = head;
        Node newNode = new Node(data);
        if (temp.data == sel) {
            newNode.next = temp.next;
            temp.next = newNode;
            return;

        }
        while (temp != null && temp.data != sel) {
            temp = temp.next;
        }
        if (temp == null)
            return;

        if (temp == tail) {
            tail.next = newNode;
            tail = newNode;
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        return;

    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.addNode(99);
        list.addNode(84);
        list.addNode(22);
        list.addNode(11);
        list.insert(99, 100);
        list.display();

    }

}
