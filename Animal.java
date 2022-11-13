public class Animal {
    String species;
    String name;
    Double weight;

    Boolean isAlive;
    Animal(String species){
        this.isAlive = true;
        this.species = species;

    }
    void feed() {
        if (this.isAlive) {
            this.weight = this.weight + 0.5;
            System.out.println("mniam dzięki");
        } else {
            System.out.println("Nie karm trupa");
        }
    }
    void takeForAWalk() {
        if (this.isAlive) {
            this.weight = this.weight - 0.5;
            System.out.println("Zwierzę zdechło");
            if (this.weight <= 0) {
                this.isAlive = false;
                System.out.println("zwierzę zostało zagłodzone");
            }
        } else {
            System.out.println("policja została wezwana");
        }
    }
    public String toString(){
        return species+" "+name+" "+weight+" "+isAlive;
    }
}


