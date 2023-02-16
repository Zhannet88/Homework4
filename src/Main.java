public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 17;
        if (age >=18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        }
        if (age <18) {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int g = 2;
        if (g >=5) {
            System.out.println("На улице " + g + " градусов, можно идти без шапки");
        }
        if (g <5) {
            System.out.println("На улице " + g + " градусов, нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 80;
        if (speed >=60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + speed + " км/ч, можно ездить спокойно");
        }
    }



}