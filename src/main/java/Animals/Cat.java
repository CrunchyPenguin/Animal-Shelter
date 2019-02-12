package Animals;

public class Cat extends Animal {

    public String badHabits;

    public Cat(String name, Gender gender, String badHabits) {
        super(name, gender);
        this.badHabits = badHabits;
    }

    public String toString() {
        return super.toString() + String.format(", bad habits: %s", this.badHabits.toLowerCase());
    }

    public double getPrice(){
        return 350.0 - this.badHabits.length() * 20;
    }
}
