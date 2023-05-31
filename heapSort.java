package IIIrdWeakDSA;

import java.util.ArrayList;
import java.util.Collections;

public class heapsort {

    void sort(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            Collections.swap(arr, i, 0);
            heapify(arr, i, 0);
        }
    }

    void heapify(ArrayList<Integer> arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr.get(left) > arr.get(largest))
            largest = left;

        if (right < n && arr.get(right) > arr.get(largest))
            largest = right;
        if (i != largest) {
            Collections.swap(arr, i, largest);
            heapify(arr, n, largest);
        }

    }

    void print(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> heap = new ArrayList<>();
        heap.add(10);
        heap.add(20);
        heap.add(50);
        heap.add(70);
        heap.add(80);
        heap.add(1);
        heapsort sort = new heapsort();
        sort.sort(heap);
        sort.print(heap);
        System.out.println(heap.size());

    }
}
