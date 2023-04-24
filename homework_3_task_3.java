import java.util.ArrayList;
import java.util.HashMap;

public class homework_3_task_3 {
    public static void main(String [] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Venus");
        planets.add("Mars");
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Mars");
        planets.add("Neptune");
        planets.add("Uranus");
        planets.add("Earth");
        planets.add("Mercury");
        planets.add("Venus");

        HashMap<String, Integer> planetCount = new HashMap<>();

        for (String planet : planets) {
            if (planetCount.containsKey(planet)) {
                int count = planetCount.get(planet);
                planetCount.put(planet, count + 1);
            } else {
                planetCount.put(planet, 1);
            }
        }

        for (String planet : planetCount.keySet()) {
            System.out.println(planet + ": " + planetCount.get(planet));
        }
    }
}
