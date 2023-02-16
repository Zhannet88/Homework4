public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
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

    public static void task4() {
        System.out.println("Задача 4");
        int age = 15;
        if (age >=2 && age <=6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >=7 && age <18){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age >=18 && age <24){
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        }
        if (age >=24){
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age =12;
        if (age <5) {
            System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься на аттракционе");
        }
        if (age >=5 && age <14){
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься только в сопровождении взрослого");
        }
        if (age >=14){
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int mest =98;
        if (mest <60) {
            System.out.println("Есть сидячие и стоячие места");
        }
        if (mest >=60 && mest <102){
            System.out.println("Есть только стоячие места");
        }
        if (mest >=102){
            System.out.println("Вагон забит");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 937;
        int two = 254;
        int three = 398;
        int max;
        if (one > two && one > three) {
            max = one;
        }
        else {
            Math.max(two, three);
        }
        System.out.println("Даны три числа: " + one+ ", " +two+ ", " +three+ ". Большим из них будет являться число " +one);
    }



}