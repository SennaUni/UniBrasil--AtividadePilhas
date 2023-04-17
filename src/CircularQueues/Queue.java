package CircularQueues;

public interface Queue<E> {
    public int size();
    public boolean isEmpty();
    public E front() ;
    public void enqueue (E element);
    public E dequeue() ;
}
