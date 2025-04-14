public class MyQueue<T extends Comparable<T>>{
    private MyLinkedList<T> list;

    public MyQueue() {
        list = new MyLinkedList<>();
    }

    public void enqueue(T item) {
        list.addLast(item);
    }

    public T dequeue() {
        T front = list.getFirst();
        list.removeFirst();
        return front;
    }

    public T front() {
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}
