package sem_2.model.hm_3;

import java.util.Arrays;
import java.util.Scanner;

//Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] mass = rand(size);
        int counter = 0;
        for (int i = 1; i < mass.length + 1; i++) {
            if(mass[i-1] > 9 && mass[i-1] < 100 || mass[i-1] < -9 && mass[i-1] > -100){
                counter += i;
            }
        }
        for (int i = 0; i < mass.length ; i++){
            if (mass[i] < 0){
                mass[i] = counter;
            }
        }
        System.out.println(counter);
        System.out.println(Arrays.toString(mass));
    }
    public static int[] rand(int size){
        int [] mas = new int[size];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random()*90)-45;
        }
        System.out.println(Arrays.toString(mas));
        return mas;
    }
}
