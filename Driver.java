public class Driver {
    public static void main (String [] args) {

        //Here's my stuffs object
        Stuff myStuff = new Stuff();

        //My stuff object information data
        myStuff.coffee = "\n" + "French Roast Ground Coffee (Medium Dark)";
        myStuff.collectible = "\n" + "Pokemon Cards";
        myStuff.container = "\n" + "Bedroom trashcan";
        myStuff.fruit = "\n" + "Bananas and Avocados";
        myStuff.dogAge = 6;

        System.out.println("\n" + "My go to coffee is: " + myStuff.coffee);
        System.out.println("\n" + "My current collectible is: " + myStuff.collectible);
        System.out.println("\n" + "I have a: " + myStuff.container);

    }
}
