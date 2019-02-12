package Animals;

import java.time.LocalDate;

public class Dog extends Animal {

    private LocalDate lastWalk;
    private boolean needsWalk;
    private int dogCount;

    public Dog(String name, Gender gender, int dogCount) {
        super(name, gender);
        this.lastWalk = LocalDate.now();
        this.dogCount = dogCount;
    }

    public LocalDate getLastWalk() {
        return lastWalk;
    }

    public boolean getNeedsWalk() {
        return this.lastWalk.until(LocalDate.now()).getDays() > 0;
    }

    public String toString() {
        return super.toString() + String.format(", last walk: %s", this.lastWalk.toString());
    }

    public double getPrice(){
        return 500.0 - dogCount * 50;
    }
}