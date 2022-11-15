import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Homework 1 exercise 1
        Scanner scAge = new Scanner(System.in);
        byte age = scAge.nextByte();
        if (age >= 18) {
            System.out.println("Поздравление пользователя с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }

        //Homework 1 exercise 2
        if (age >= 7 && age < 18) {
            System.out.println("Человек - ребенок, он должен ходить в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        //Homework 1 exercise 3
        byte maxVanCapacity = 102;
        byte seatingInVan = 60;
        Scanner scanForVan = new Scanner(System.in);
        short amountOfPeopleIn = scanForVan.nextShort();
        if (amountOfPeopleIn < seatingInVan) {
            System.out.println("Есть как сидячие так и стоячие места");
        }
        if (amountOfPeopleIn >= seatingInVan && amountOfPeopleIn < maxVanCapacity) {
            System.out.println("Есть только стоячие места");
        }
        if (amountOfPeopleIn > maxVanCapacity) {
            System.out.println("В вагоне не осталось мест");
        }

        //Homework 2 exercise 1
        Scanner scAge2 = new Scanner(System.in);
        byte ageNew = scAge2.nextByte();
        if (ageNew >= 18) {
            System.out.println("Поздравление пользователя с совершеннолетием");
        } else {
            System.out.println("возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }

        //Homework 2 exercise 2
        if (ageNew >= 7 && ageNew < 18) {
            System.out.println("Человек - ребенок, он должен ходить в школу");
        } else if (ageNew >= 18 && ageNew < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else if (ageNew >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        } else {
            System.out.println("Еще молод для нашего исследования");
        }

        //Homework 2 exercise 3
        byte maxVanCapacityNew = 102;
        byte seatingInVanNew = 60;
        Scanner scanForVanNew = new Scanner(System.in);
        short amountOfPeopleInNew = scanForVanNew.nextShort();
        if (amountOfPeopleInNew < seatingInVanNew) {
            System.out.println("Есть как сидячие так и стоячие места");
        } else if (amountOfPeopleInNew >= seatingInVanNew && amountOfPeopleInNew < maxVanCapacityNew) { // Загадка почему выделяет
            System.out.println("Есть только стоячие места");
        } else {
            System.out.println("В вагоне не осталось мест");
        }

        //Homework 3 exercise 1
        Scanner scanAgeFor_3_1 = new Scanner(System.in);
        byte ageFor_3_1 = scanAgeFor_3_1.nextByte();
        boolean kindergarten = ageFor_3_1 >= 2 && ageFor_3_1 <= 6;
        boolean school = ageFor_3_1 > 6 && ageFor_3_1 <= 18;
        boolean university = ageFor_3_1 > 18 && ageFor_3_1 <= 24;
        boolean work = ageFor_3_1 > 24;
        if (kindergarten) {
            System.out.println("Если возраст человека равен " + scanAgeFor_3_1 + ", то ему нужно ходить в детский сад");
        } else if (school) {
            System.out.println("Если возраст человека равен " + scanAgeFor_3_1 + ", то ему нужно ходить в школу");
        } else if (university) {
            System.out.println("Если возраст человека равен " + scanAgeFor_3_1 + ", то ему нужно ходить в университет");
        } else if (work) {
            System.out.println("Если возраст человека равен " + scanAgeFor_3_1 + ", то ему нужно ходить на работе");
        } else {
            System.out.println("Если возраст человека равен " + scanAgeFor_3_1 + ", то ему не нужно ходить, это и так ему с трудом удается");
        }

        //Homework 3 exercise 2
        Scanner scanFor_3_2 = new Scanner(System.in);
        byte ageFor_3_2 = scanFor_3_2.nextByte();
        if (ageFor_3_2 < 5) {
            System.out.println("Ребенок не может кататься на аттракционах");
        } else if (ageFor_3_2 >= 5 && ageFor_3_2 < 14) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("Человек может кататься без сопровождения взрослого");
        }

        //Homework 3 exercise 3
        Scanner scanFirstNumber = new Scanner(System.in);
        Scanner scanSecondNumber = new Scanner(System.in);
        Scanner scanThirdNumber = new Scanner(System.in);
        int one = scanFirstNumber.nextInt();
        int two = scanSecondNumber.nextInt();
        int three = scanThirdNumber.nextInt();
        if (one > two && one > three) {
            System.out.println(one + " самое большое число из трёх");
        } else if (two > one && two > three) {
            System.out.println(two + " самое большое число из трёх");
        } else if (three > two && one < three) {
            System.out.println(three + " самое большое число из трёх");
        } else {
            System.out.println("С одинаковыми непонятно что делать");
        }
    }
}