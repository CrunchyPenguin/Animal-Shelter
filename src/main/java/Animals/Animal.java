package Animals;

import java.time.LocalDateTime;
import Interfaces.Sellable;

public abstract class Animal implements Sellable {

    private String name;
    private Gender gender;
    private Reservor reservedBy;

    public Animal(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Reservor getReservedBy() {
        return reservedBy;
    }

    public boolean reserve(String reservedBy) {
        if(this.reservedBy == null){
            this.reservedBy = new Reservor(name, LocalDateTime.now());
            return true;
        }
        return false;
    }

    public String toString() {
        String reserved = "not reserved";
        if (this.reservedBy != null) {
            reserved = String.format("reserved by %s", this.reservedBy.getName());
        }
        return String.format("%s, %s, %s", this.name, this.gender, reserved);
    }
}
