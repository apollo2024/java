package sem_2.model.hm_1;

import java.util.Scanner;

//1) Дана последовательность N целых чисел. Найти сумму простых чисел.
public class Main {
    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;
        System.out.println("Введите положительное число: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        for (int i = 0; i < input; i++) {
            int num = in.nextInt();
            if (num == 1){counter++;}
            for (int j = 2; j < num; j++) {
                if (num % j == 0 ){
                    counter ++;
                }
            }
            if (counter == 0 ){
                sum += num;
            }
            counter = 0;

        }
        System.out.println(sum);
    }
}
