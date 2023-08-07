public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();/*
        task5();
        task6();
        task7(); */
    }
    public static void task1 () {
        System.out.println("task1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", он совершеннолетний");
        }
        else System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        System.out.println();
    }

    public static void task2 () {
        System.out.println("task2");
        int temperature = 5;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
            System.out.println();
        }
    }
    public static void task3 () {
        System.out.println("task3");
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
            System.out.println();
        }
    }
    public static void task4 () {
        System.out.println("task4");
        int age = 2;
        if (age < 2) {
                System.out.println("Если возраст человека равен " + age + ", то ему пора спать");
            }
        else if (age >= 2 && age <= 6) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
            }
        else if (age >= 7 && age <= 18) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
            }
        else if (age > 18 && age < 24) {
                System.out.println("Если возраст человека равен " + age + ", то его место в университете");
            }
        else if (age >= 24 && age <= 60) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        } else System.out.println("Если возраст человека равен " + age + ", то он может отдохнуть");
                System.out.println();

    }

}