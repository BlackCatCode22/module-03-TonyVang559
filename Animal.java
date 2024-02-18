package myAnimals;

public class Animal {
    public static void main(String[] args) {
        System.out.println("\n" + Cat.getCatCount());

        Cat myCat = new Cat();
        myCat.meow();

        myCat.name = "Leela";
        myCat.age = 5;
        myCat.behavior = "Friendly";
        myCat.color = "Orange";
        myCat.size = "Medium";

        System.out.println("\n" + Cat.getCatCount());
        System.out.println(Cat.MAX_LIVES);


        Dog myDog = new Dog();
        myDog.bark();

        myDog.name = "Jake";
        myDog.age = 9;
        myDog.behavior = "Friendly";
        myDog.color = "Brown";
        myDog.size = "Small";
        myDog.toys = 5;
        myDog.breed = "Chihuahua";

        System.out.println("\n" + Dog.getDogCount());
        System.out.println(Dog.Maximum_TOYS);

    }

}
