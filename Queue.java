import java.util.List;
import java.util.LinkedList;

public class Queue<T> {
    protected List<T> queue;

    public Queue(){
        this.queue = new LinkedList<>();
    }

    public void enqueue(T x) {
        this.queue.add(x);
    }

    public T dequeue() {
        if (!isEmpty()) {
            return this.queue.remove(0);
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return this.queue.size() == 0;
    }

    public int getSize() {
        return this.queue.size();
    }

    public T peek() {
        if (!isEmpty()) {
            return this.queue.get(0);
        } else {
            return null;
        }
    }
}
