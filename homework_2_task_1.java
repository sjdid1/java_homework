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

import java.util.Arrays;
public class homework_2_task_1 {
      public static void main(String[] args) {
          String s = "cba";
          int[] index = {3, 2, 1};
  
          String shuffled = shuffle(s, index);
  
          System.out.println(shuffled);
      }
  
      public static String shuffle(final String s, final int index) {
          char shuffled = new chars.length();
  
          for (int i = 0; i < s.length(); i++) {
              shuffledindex[i] = s.charAt(i);
          }
  
          return new String(shuffled);
      }
}
