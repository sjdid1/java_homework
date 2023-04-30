import java.util.*;
public class homework_5_task_2 {
    public static void main(String[] args) {
        String[] employees = {"Ivan Ivanov", "Svetlana Petrova", "Kristina Belova", "Anna Musina", "Anna Krutova",
                              "Ivan Yurin", "Petr Lykov", "Pavel Chernov", "Petr Chernyshov", "Maria Fedorova",
                              "Marina Svetlova", "Maria Savina", "Maria Rykova", "Marina Lugova", "Anna Vladimirova",
                              "Ivan Mechnikov", "Petin Petin", "Ivan Yezhov"};

        Map<String, Integer> duplicateCount = new HashMap<>();
        for (String employee : employees) {
            if (duplicateCount.containsKey(employee)) {
                int count = duplicateCount.get(employee);
                duplicateCount.put(employee, count + 1);
            } else {
                duplicateCount.put(employee, 1);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Map<String, Integer> sortedMap = new TreeMap<>(new ValueComparator(duplicateCount));
        sortedMap.putAll(duplicateCount);

        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    static class ValueComparator implements Comparator<String> {
        Map<String, Integer> map;

        public ValueComparator(Map<String, Integer> map) {
            this.map = map;
        }

        @Override
        public int compare(String s1, String s2) {
            if (map.get(s1) >= map.get(s2)) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
