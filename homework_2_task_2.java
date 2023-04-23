import java.util.*;
import java.util.Scanner;
public class homework_2_task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String[] lines = new String[n];
        for (int i = 0; i < n; i++) {
            lines[i] = scanner.nextLine();
        }
        int m = scanner.nextInt();
        scanner.nextLine(); 
        Map<String, String> replacements = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String[] tokens = scanner.nextLine().split(" - ");
            replacements.put(tokens[0], tokens[1]);
        }
        for (String line : lines) {
            for (Map.Entry<String, String> entry : replacements.entrySet()) {
                line = line.replaceAll(entry.getKey(), entry.getValue());
            }
            System.out.println(line);
        }
    }
}
