public class MyMinHeap<T extends Comparable<T>> {
    private T[] heap;
    private int size;

    public MyMinHeap() {
        heap = (T[]) new Comparable[100];
        size = 0;
    }

    public void insert(T item) {
        heap[size] = item;
        siftUp(size);
        size++;
    }

    public T extractMin() {
        if (size == 0) return null;
        T min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        siftDown(0);
        return min;
    }

    private void siftUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap[index].compareTo(heap[parent]) < 0) {
                swap(index, parent);
                index = parent;
            } else break;
        }
    }

    private void siftDown(int index) {
        while (2 * index + 1 < size) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int smallest = left;

            if (right < size && heap[right].compareTo(heap[left]) < 0) {
                smallest = right;
            }

            if (heap[smallest].compareTo(heap[index]) < 0) {
                swap(smallest, index);
                index = smallest;
            } else break;
        }
    }

    private void swap(int i, int j) {
        T tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
