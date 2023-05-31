package IIIrdWeakDSA;

/**
 * heap
 */
public class heap {

    private Integer[] heap;
    private int n;

    heap() {
        heap = new Integer[3];
        n = -1;
    }

    void insert(int data) {
        if (n == heap.length - 1) {
            resize(n * 2);
        }
        n++;
        heap[n] = data;
        swim(n);
    }

    void swim(int index) {
        while (index > 1 && heap[index] > heap[(index - 1) / 2]) {
            int temp = heap[index];
            heap[index] = heap[(index - 1) / 2];
            heap[(index - 1) / 2] = temp;
            index = (index - 1) / 2;
        }
    }

    void resize(int capacity) {
        Integer[] temp = new Integer[capacity];
        for (int i = 0; i < heap.length; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    int getmax() {
        return heap[0];
    }

    int deletemax() {
        int max = heap[0];
        swap(0, n);
        n--;
        sink(0, n);
        heap[n + 1] = null;
        if (n == heap.length / 4) {
            resize(heap.length / 2);
        }
        return max;
    }

    void sink(int top, int n) {
        while (2 * top <= n) {
            int left = 2 * top + 1;
            if (left < n && heap[left + 1] > heap[left]) {
                left++;
            }
            if (heap[top] >= heap[left]) {
                break;
            }
            swap(top, left);
            top = left;
        }
    }

    void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    public static void main(String[] args) {
        heap h = new heap();
        h.insert(10);
        h.insert(20);
        h.insert(30);
        System.out.println(h.deletemax());

    }
}