package CircularQueues;
public class TesteCircularQueues {
    public void execute(){
        ArrayCircularQueue q = new ArrayCircularQueue(5);
        q.enqueue("Elemento 1");
        System.out.println(q.toString());
        q.enqueue("Elemento 2");
        System.out.println(q.toString());
        q.enqueue("Elemento 3");
        System.out.println(q.toString());
        q.enqueue("Elemento 4");
        System.out.println(q.toString());
        q.enqueue("Elemento 5");
        System.out.println(q.toString());
    }
}
