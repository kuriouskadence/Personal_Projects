
// inheretence "extends"
public class Dog extends Animal {
    
    String ownerName;

    public Dog() {
        super();
        this.ownerName = "--[OWNERNAME]--";
    }
    
    public Dog(String name, String haircolor, String ownerName) {
        super(4, "bark woof grrr", name, haircolor, 5000);
        this.ownerName = ownerName;
    }

    @Override
    public boolean isEndangered() {
        return this.getPopulation() < 33_000;
    }

    @Override
    public String toString() {
        String returnStr = "";
        returnStr += "Name: " + this.name + "\n";
        returnStr += "Number of Legs: " + this.numLegs + "\n";
        returnStr += "Sound: " + this.sound + "\n";
        returnStr += "Haircolor: " + this.haircolor + "\n";
        returnStr += "Owner Name: " + this.ownerName + "\n";
        returnStr += "Population: " + this.getPopulation() + "\n";
        return returnStr;
    }

  
    
}
