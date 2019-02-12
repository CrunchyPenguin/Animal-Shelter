package Animals;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    private Cat cat;

    @BeforeEach
    void setUp(){
        this.cat = new Cat("Simba", Gender.MALE, "Escapes");
    }

    @Test
    void testPrice()
    {
        assertNotSame(10, this.cat.getPrice());
    }
}