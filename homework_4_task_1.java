import java.util.LinkedList;
public class homework_4_task_1 {
    public LinkedList flipList(LinkedList list) {
        LinkedList flippedList = new LinkedList();
        while (!list.isEmpty()) {
            flippedList.addFirst(list.removeFirst());
        }
        return flippedList;
    }
    
}
