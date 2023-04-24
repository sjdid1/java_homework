import java.util.ArrayList;
import java.util.Collections;

public class homework_3_task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(25);

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double mean = (double) sum / numbers.size();

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Arithmetic Mean: " + mean);
    }
}
