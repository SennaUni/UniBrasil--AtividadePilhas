package Queue;

import java.util.Arrays;

public class ArrayQueue<E> implements Queue<E> {
    protected int capacity;
    public static final int CAPACITY = 1000;
    protected E Q[];
    protected int f; // Posição do primeiro item da fila
    protected int r; // Posição da fila livre para inserir um novo elemento

    public ArrayQueue() {
        this(CAPACITY); // default capacity
    }

    public ArrayQueue(int cap) {
        capacity = cap;
        Q = (E[]) new Object[capacity];
        f = 0;
        r = 0;
    }

    @Override
    public int size() {
        return (this.capacity - f);
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
        r += 1;
    }

    @Override
    public E dequeue() {
        E temp;
        temp = Q[f];
        Q[f] = null;
        f += 1;
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