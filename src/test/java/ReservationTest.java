import Animals.Gender;

import org.junit.jupiter.api.*;

public class ReservationTest {
    private Reservation reservation;

    @BeforeEach
    public void TestInitialize(){
        this.reservation = new Reservation();
    }

    @Test
    public void TestNewCat(){
        Assertions.assertEquals(0, this.reservation.getAnimals().size());
        this.reservation.NewCat("Ms. Meow", Gender.FEMALE, "Scratches couch");
        Assertions.assertEquals(1, this.reservation.getAnimals().size());
    }

    @Test
    public void TestNewDog(){
        Assertions.assertEquals(0, this.reservation.getAnimals().size());
        this.reservation.NewDog("Sgt. Woof", Gender.MALE);
        Assertions.assertEquals(1, this.reservation.getAnimals().size());
    }
}
