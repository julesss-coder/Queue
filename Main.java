public class Main {

    public static void main(String[] args) {
        Queue<Integer> myQueue = new Queue<>();

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        System.out.println("Queue size: " + myQueue.size());
        myQueue.printQueue();

        System.out.println("Queue size: " + myQueue.size());
        // Throws exception: Exception in thread "main" java.lang.ClassCastException: class [Ljava.lang.Object; cannot be cast to class [Ljava.lang.Integer; ([Ljava.lang.Object; and [Ljava.lang.Integer; are in module java.base of loader 'bootstrap')
        //	at Main.main(Main.java:13)
        // The method call works, the exception is thrown during the casting
        Integer[] returnedDeletedValues = myQueue.dequeue(2);
    }
}
