package sem_2.model.hm_2;

import java.util.Scanner;
//Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("put the size of subsequence that you want");
        int size = in.nextInt();
        int[] mass = newSubsequence(size);
        boolean res = true;
        for (int i = 1; i < mass.length ; i++) {
            if (mass[i] <= mass[i - 1]){
                res = false;
                break;
            }

        }
        System.out.println(res);
    }

    public static int[] newSubsequence(int size) {
        int[] marks = new int[size];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            marks[i] = in.nextInt();
        }
        return marks;
    }
}