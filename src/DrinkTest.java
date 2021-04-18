import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class DrinkTest {

    Drink d;

    @BeforeEach
    void setup() throws Exception{
        d = new Drink("Test","small", 4746);
    }

    @Test
    void getName() {assertEquals("Test",d.getName(),"");
    }

    @Test
    void getSize() {assertEquals("small", d.getSize(), "");
    }

    @Test
    void getPrice() {assertEquals(4746, d.getPrice(), 0);
    }

}