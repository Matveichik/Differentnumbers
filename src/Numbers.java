/*
По данному числу 1≤𝑛≤109 найдите максимальное число 𝑘, для которого 𝑛 можно представить как сумму 𝑘  различных натуральных слагаемых. Выведите в первой строке число 𝑘, во второй — 𝑘
 слагаемых.
 */


import java.util.Scanner;

public class  Numbers {



    private void run(){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(find(n));
    }


   private String find(int n){
      int i =1;
       StringBuilder sb = new StringBuilder();
       while (n > 2 * i ){
           n =n-i;
           sb.append(i++ + " ");
       }
       sb.append(n);
       System.out.println(i);
      return sb.toString();

   }
    public static void main(String[] args) {
        double time  = 0.001; // константа для перевода мс в сек
        double startTime = System.currentTimeMillis(); // начало работы алгаритма
        new Numbers().run();
        double finalTime = System.currentTimeMillis(); // конец работы алгоритма
        System.out.println((finalTime - startTime)*time + " - Время работы алгоритма в секундах");  // методы дл

    }
}
