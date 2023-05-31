
public class stacklist {

    public class stack {
        int data;
        stack next;

        stack(int data) {
            this.data = data;
        }
    }

    public stack top = null;

    void pushelement(int data) {
        stack newnode = new stack(data);
        if (top == null) {
            top = newnode;
        } else {
            newnode.next = top;
            top = newnode;
        }

    }

    void display() {
        stack temp = top;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void popelement() {
        top = top.next;

    }

    public static void main(String[] args) {
        stacklist list = new stacklist();
        list.pushelement(10);
        list.pushelement(20);

        list.pushelement(30);

        list.pushelement(40);

        list.display();

    }

}