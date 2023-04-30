import java.util.LinkedList;
import java.util.Iterator;
public class homework_4_task_1 {
    public LinkedList<Integer> invert(LinkedList<Integer> list) {
        LinkedList<Integer> invertedList = new LinkedList<>();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            invertedList.addFirst(iterator.next());
        }
        return invertedList;
    }
    
}
