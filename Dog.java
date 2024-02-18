package myAnimals;

public class Dog {

    private static int dogCount = 1;
    public static  final int Maximum_TOYS = 5;

    String name;
    String size;
    String behavior;
    String breed;
    String color;
    int age;
    int toys;

    public void bark() {
        System.out.println("\n" + "woof woof woof!!!");

    }

    public static int getDogCount() {
        return dogCount;

    }

    public Dog() {
        dogCount++;
        toys = Maximum_TOYS;

    }

}

