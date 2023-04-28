import java.util.LinkedList;
import java.util.Iterator;
public class homework_4_task_3 {
    public int sum(LinkedList<Integer> list) {
        int sum = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        return sum;
    }
}
