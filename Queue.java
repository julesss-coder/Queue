import DoublyLinkedList.DoublyLinkedList;

public class Queue<T> {
    private DoublyLinkedList<T> list;

    public Queue() {
        list = new DoublyLinkedList<T>();
    }

    public void enqueue(T value) {
        list.append(value);
    }

    public int size() {
        return list.listLength();
    }

    public T dequeue() {
        return list.delete(0);
    }

    public Object[] dequeue(int n) {
        Object[] deletedValues = new Object[n];

        for (int i = 0; i < n; i++) {
            deletedValues[i] = dequeue();
        }

        return deletedValues;
    }

    public void printQueue() {
        list.printList();
    }




}
