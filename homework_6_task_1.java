import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class homework_6_task_1 {

    public static void main(String[] args) {
            
            Laptop laptop1 = new Laptop("Dell", "Inspiron 15", 8, 256, "Windows 10", "Black");
            Laptop laptop2 = new Laptop("HP", "Pavilion x360", 16, 512, "Windows 10", "Silver");
            Laptop laptop3 = new Laptop("Lenovo", "ThinkPad X1 Carbon", 16, 1_000, "Windows 10", "Black");
            Laptop laptop4 = new Laptop("Apple", "MacBook Pro", 16, 512, "macOS", "Space Gray");
            Laptop laptop5 = new Laptop("Asus", "ZenBook UX425EA", 8, 512, "Windows 10", "Pine Grey");
            
            
            ArrayList<Laptop> laptops = new ArrayList<>();
            laptops.add(laptop1);
            laptops.add(laptop2);
            laptops.add(laptop3);
            laptops.add(laptop4);
            laptops.add(laptop5);
            
            LaptopStore laptopStore = new LaptopStore(laptops);
            
           
            Scanner scanner = new Scanner(System.in);
            Map<String, Object> filterCriteria = new HashMap<>();
            
            System.out.println("Enter a number that matches the required criteria:");
            System.out.println("1 - RAM");
            System.out.println("2 - HDD volume");
            System.out.println("3 - Operating system");
            System.out.println("4 - Color");
            
            int filterOption = scanner.nextInt();
            
            switch (filterOption) {
                case 1:
                    System.out.println("Enter minimum RAM:");
                    int minRam = scanner.nextInt();
                    filterCriteria.put("ram", minRam);
                    break;
                case 2:
                    System.out.println("Enter minimum HDD volume:");
                    int minHddVolume = scanner.nextInt();
                    filterCriteria.put("hddVolume", minHddVolume);
                    break;
                case 3:
                    System.out.println("Enter operating system:");
                    String operatingSystem = scanner.next();
                    filterCriteria.put("operatingSystem", operatingSystem);
                    break;
                case 4:
                    System.out.println("Enter color:");
                    String color = scanner.next();
                    filterCriteria.put("color", color);
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
            
            
            ArrayList<Laptop> filteredLaptops = laptopStore.filterLaptops(filterCriteria);
            laptopStore.displayLaptops(filteredLaptops);

    private ArrayList<Laptop> laptops;

    public LaptopStore(ArrayList<Laptop> laptops) {
        this.laptops = laptops;
    }

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public void removeLaptop(Laptop laptop) {
        laptops.remove(laptop);
    }

    public ArrayList<Laptop> filterLaptops(Map<String, Object> filterCriteria) {
        ArrayList<Laptop> filteredLaptops = new ArrayList<>();

        for (Laptop laptop : laptops) {
            boolean matchesCriteria = true;

            for (Map.Entry<String, Object> entry : filterCriteria.entrySet()) {
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();

                try {
                    Field field = laptop.getClass().getDeclaredField(fieldName);
                    Object actualValue = field.get(laptop);

                    if (!actualValue.equals(fieldValue)) {
                        matchesCriteria = false;
                        break;
                    }
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

            if (matchesCriteria) {
                filteredLaptops.add(laptop);
            }
        }

        return filteredLaptops;
    }

    public void displayLaptops(ArrayList<Laptop> laptops) {
        System.out.println("Brand\tModel\tRAM\tHDD\tOS\tColor");

        for (Laptop laptop : laptops) {
            System.out.println(laptop.getBrand() + "\t" + laptop.getModel() + "\t" +
                    laptop.getRam() + "\t" + laptop.getHddVolume() + "\t" +
                    laptop.getOperatingSystem() + "\t" + laptop.getColor());
        }
    }
}
}