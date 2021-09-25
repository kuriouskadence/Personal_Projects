public class Application {
    public static void main(String[] args) {
        // Animal houseCat = new Animal();
        // System.out.println("Number of Legs: " + houseCat.numLegs);
        // houseCat.numLegs = 3; // only works when public
        // System.out.println("Number of Legs: " + houseCat.numLegs);
        // houseCat.setNumLegs(3);
        // System.out.println("Number of Legs: " + houseCat.getNumLegs());

        // System.out.println("Name: " + houseCat.name);
        // System.out.println("Sound: " + houseCat.sound);
        // System.out.println("Haircolor: " + houseCat.haircolor);
        // System.out.println("Endangered: " + houseCat.getEndangered());

        Dog doge = new Dog("cat", "white", "Steven");
        System.out.println(doge);
    }
}
