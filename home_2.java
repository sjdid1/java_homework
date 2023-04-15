import java.util.Scanner;
public class home_2 {
   public static void main(String[] args) {
      double num1;
      double num2;
      double result;
      char operation;
      Scanner reader = new Scanner(System.in);
      System.out.print("Введите 2 числа: ");
      num1 = reader.nextDouble();
      num2 = reader.nextDouble();
      System.out.print("\nВыберите действие (+, -, *, /): ");
      operation = reader.next().charAt(0);
      switch(operation) {
         case '+': result = num1 + num2;
            break;
         case '-': result = num1 - num2;
            break;
         case '*': result = num1 * num2;
            break;
         case '/': result = num1 / num2;
            break;
         default:  System.out.printf("Ошибочка! Введите корректно");
            return;
      }
      System.out.print("\nРезультат:\n");
      System.out.printf(num1 + " " + operation + " " + num2 + " = " + result);
   }
}