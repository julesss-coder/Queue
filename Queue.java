import DoublyLinkedList.DoublyLinkedList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Queue<T> {
    private final DoublyLinkedList<T> list;

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

    public T[] dequeue(int n) {
        // FIXME If this doesn't work, use Alex's solution
//        @SuppressWarnings("unchecked")
//        T[] deletedValues = (T[]) new Object[n];
//        System.out.println(deletedValues.length);
//        System.out.println(deletedValues.getClass());
        // FIXME: Mike says: Use reflection instead
        // FIXME Andi's solution:
        @SuppressWarnings("unchecked")
        T[] deletedValues = (T[]) Array.newInstance(list.searchList(0).getClass(), n);

        System.out.println(deletedValues.length);
        System.out.println(deletedValues.getClass());

        for (int i = 0; i < n; i++) {
            deletedValues[i] = dequeue();
        }

        return deletedValues;
    }

    public void printQueue() {
        list.printList();
    }

}
