import java.time.LocalTime;

public class Main {
//    6. Створити клас Time.java для роботи з часом у форматі «година:хвилина:секунда»
//    з трьома полями типу short. Клас повинен включати не менше чотирьох
//    конструкторів: ініціалізація числами, рядком, секундами та часом.
//    Обов’язковими операціями є: обчислення різниці між двома моментами часу у
//    секундах, додавання часу та заданої кількості секунд, віднімання з часу заданої
//    кількості секунд, порівняння моментів часу, перевід в секунди, перевід в
//    хвилини (з заокругленням до цілої хвилини)

    public static void main(String[] args) {
        System.out.println("Java Lab 2 ");

        Time time = new Time((short)4,(short)12,(short)55);
        LocalTime now = LocalTime.of(3,10,22);
        Time early = new Time(now);
        Time timeStr = new Time("5:13:60");
        int hour = now.getHour();

        System.out.println("Taks 1:");
        System.out.println("TIME: 5:13:60");
        System.out.println("toMinute " + timeStr.toMinute());
        System.out.println("toSecond " + timeStr.toSecond());
        System.out.println("subtraction 2000 second " + timeStr.subtractionSecond((short) 2000));
        System.out.println("addition " + timeStr.addition(early));

        System.out.println("Taks 2:");
        Vector vector = new Vector(4.2, 5.1, 1.0);
        Vector vector2 = new Vector(12.2, 8.1, 1.0);
        System.out.println("Magnitude = " + vector.getMagnitude());
        System.out.println("Cross product = " + vector.crossProduct(vector2));
        System.out.println("Cross product = " + vector.addition(vector2));


        BinaryTree tree = new BinaryTree();

        tree.add(999);
        tree.add(3);
        tree.add(7);
        tree.add(1);
        tree.add(9);

        System.out.println("Taks 3:");
        System.out.println("Tree contains 999: " + tree.contains(999)); // true
        System.out.println("Tree contains 8: " + tree.contains(8)); // false

        tree.remove(999);
        System.out.println("tree.remove(999);");

        System.out.println("Tree contains 999: " + tree.contains(999)); // false
    }
}
