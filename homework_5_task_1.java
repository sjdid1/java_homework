import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class homework_5_task_1 {
    private Map<String, Set<String>> phoneBook;
    public void PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addEntry(String name, String phone) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new HashSet<>());
        }
        phoneBook.get(name).add(phone);
    }

    public Set<String> search(String name) {
        return phoneBook.getOrDefault(name, new HashSet<>());
    }
}
