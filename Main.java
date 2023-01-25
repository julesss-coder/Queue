


public class Main {

    public static void main(String[] args) {
        Queue<Integer> myQueue = new Queue<>();

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        System.out.println("Queue size: " + myQueue.size());
        myQueue.printQueue();

        System.out.println("Queue size: " + myQueue.size());
        Object[] returnedDeletedValues = myQueue.dequeue(3);
        Integer[] deletedValues = new Integer[returnedDeletedValues.length];
        for (int i = 0; i < deletedValues.length; i++) {
            deletedValues[i] = (Integer) returnedDeletedValues[i];
            System.out.println(deletedValues[i]);
        }
    }
}
