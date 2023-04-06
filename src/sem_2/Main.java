package sem_2;

import sem_2.model.Heir;
import sem_2.model.Vector;


public class Main {
    public static void main(String[] args) {

        Heir vector1 = new Heir(1.0, 1.0, 1.0);
        Heir vector2 = new Heir(1.0, 2.0, 1.0);
        System.out.println(vector1);
        System.out.println(vector2);
        System.out.println("длинна вектора = " + vector1.lenghtVector());
        System.out.println("скалярное произведение = " + vector1.scalarMulti(vector2));
        System.out.println("произведение векторов с другими = " + vector1.vectorMulti(vector2));
        System.out.println("косинус углов = " + vector1.cosVector(vector2));
        System.out.println("сумма вектаров = " + vector1.sumVector(vector2));
        System.out.println("разность вектаров = " + vector1.diffVector(vector2));
    }
}