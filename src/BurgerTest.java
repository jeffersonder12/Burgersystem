import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class BurgerTest {

    Burger b;

    @BeforeEach
    void setup() throws Exception{
        b = new Burger("test", 4);
    }

    @Test
    void getPrice(){assertEquals(4, b.getPrice(), 0);}

}