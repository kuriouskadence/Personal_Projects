public class Animal {
  
    
    int numLegs;
    String sound;
    String name;
    String haircolor;
    // Animal mother;
    // private boolean endangered;
    private int population;


    // constructor Method 
    // this is called on declaration of animal object WITHOUT any permameters 
    public Animal(){
        this.numLegs = 0;
        this.sound = "--[SOUND]--";
        this.name = "--[NAME]--";
        this.haircolor = "--[HAIRCOLOR]--";
        // this.endangered = false;
        this.population = 0;
    }

     // constructor Method 
    // this is called on declaration of animal object WITH any permameters 
    public Animal(int numLegs, String sound, String name, String haircolor, int population){
       this.numLegs = numLegs;
       this.sound = sound;
       this.name = name;
       this.haircolor = haircolor;
    //    this.endangered = endangered;
       this.population = population;
    }
    
    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }
    public String getHaircolor() {
        return haircolor;
    }

    // public void setEndangered(boolean endangered) {
    //     this.endangered = endangered;
    // }
    
    // public boolean getEndangered(){
    //     return this.endangered;
    // }

    protected int getPopulation() {
        return population;
    } 


    public boolean isEndangered() {
        return population < 1000;
    }



}
