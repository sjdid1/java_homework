import java.util.NoSuchElementException;
import java.util.LinkedList;
public class homework_4_task_2 {
    private LinkedList<Object> list = new LinkedList<Object>();

    public void enqueue(Object item) {
        list.addLast(item);
    }

    public Object dequeue() {
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.removeFirst();
    }

    public Object first() {
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
