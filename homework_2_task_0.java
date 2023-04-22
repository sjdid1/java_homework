public class homework_2_task_0 {

        // Посчитайте сколько драгоценных камней в куче обычных камней
        // Пример:
        // jewels = “aB”, stones = “aaaAbbbB”
        // Результат в консоль ”a3B1”
            public static void main(String [] args) {
               String jewels = "aB";
               String stones = "aaaAbbbB";
               int countA = 0;
               int countB = 0;
         
               for (int i = 0; i < stones.length(); i++) {
                  if (jewels.indexOf(stones.charAt(i)) != -1) {
                     if (stones.charAt(i) == 'a') {
                        countA++;
                     } else if (stones.charAt(i) == 'B') {
                        countB++;
                     }
                  }
               }
         
               System.out.println("a" + countA + "B" + countB);
            } 
}
