public class StackString implements StackInterface {
    protected String[] ArrayStack;
    public static final int DEFAULT_CAPACITY = 20;
    protected int capacity;
    protected int top = -1;

    public StackString() { // Constructor Default
        this(DEFAULT_CAPACITY);
    }

    public StackString(int cap) { // Constructor Int Param
        this.capacity = cap;
        this.ArrayStack = new String[capacity];
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top < 0;
    }

    @Override
    public String top() {
        return this.ArrayStack[top];
    }

    @Override
    public void push(String element) {
        this.ArrayStack[++top] = element;
        System.out.println("Elemento inserido: " + element);
    }

    @Override
    public String pop() {
        if (this.top < 0) throw new ExceptionCustomizada();

        String element = this.ArrayStack[this.top];
        this.ArrayStack[this.top--] = null;
        System.out.println("Elemento removido: " + element);
        return element;
    }

    @Override
    public String toString() {
        String returnString;
        returnString = "[";
        if (size() > 0) returnString+= this.ArrayStack[0];
        if (size() > 1)
            for (int i = 1; i <= size()-1; i++) {
                returnString+= ", " + this.ArrayStack[i];
            }
        return returnString + "]";
    }
}
