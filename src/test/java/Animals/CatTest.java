package Animals;

import org.junit.jupiter.api.*;

public class CatTest {
    private Cat cat;

    @BeforeEach
    public void TestInitialize(){
        this.cat = new Cat("Ms. Meow", Gender.FEMALE, "Scratches couch");
    }

    @Test
    public void TestConstructor(){
        Assertions.assertEquals("Ms. Meow", this.cat.getName());
    }
}
