// Вам дается строка S и целочисленный массив индексов int index[s.length].
// // Напишите программу, которая перетасует символы в S таким образом,
// // что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
// //
// // Пример: s = “cba”, index = [3,2,1] result “abc”
// public static void main(String[] args) {

// }

// public String shuffle(final String s, final int[] index){

// return "";
// }
// }

public class homework_2_task_1 {
   public static String restoreString(String s, int indices) {
      char result = new char.length();
      for (int i = 0; i < s.length(); i++) {
         result[i] = s.charAt(i);
      }
      return new String(result);
   }

   public static void main(String args) {
      String s = "cba";
      int [] indices = { 3, 2, 1 };
      System.out.println(restoreString(s, indices));
   }
}
