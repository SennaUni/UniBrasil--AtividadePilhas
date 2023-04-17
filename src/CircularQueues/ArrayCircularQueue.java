package CircularQueues;

import java.util.Arrays;

public class ArrayCircularQueue<E> implements Queue<E> {
    protected int capacity;
    public static final int CAPACITY = 1000;
    protected E Q[];

    protected int f;
    protected int r;

    public ArrayCircularQueue() {
        this(CAPACITY);
    }

    public ArrayCircularQueue(int cap) {
        capacity = cap;
        Q = (E[]) new Object[capacity];
        f = 0;
        r = 0;
    }

    @Override
    public int size() {
        return (this.capacity - f + r) % this.capacity;
    }

    @Override
    public boolean isEmpty() {
        return (f == r);
    }

    @Override
    public E front() {
        return Q[f];
    }

    @Override
    public void enqueue(E element) {
        Q[r] = element;
        r = (r + 1) % capacity;
    }

    @Override
    public E dequeue() {
        E temp;
        temp = Q[f];
        Q[f] = null;
        f = (f + 1) % capacity;
        return temp;
    }

    @Override
    public String toString() {
        return "ArrayQueue { \n" +
                "capacity=" + capacity + "\n " +
                ", Q=" + Arrays.toString(Q) + "\n " +
                ", Primeiro Elemento =" + f + "\n " +
                ", Próximo livre =" + r + "\n " +
                '}' + "\n ";
    }
}
