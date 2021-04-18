import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinkDecoratorTest {

    Gericht g;
    Drink d;
    DrinkDecorator dd;

    @BeforeEach
    void setUp() {
        g = new Gericht() {
            @Override
            public double getPrice() {
                return 5;
            }

            @Override
            public String getName() {
                return "Test";
            }

            @Override
            public String getDescription() {
                return "Test Gericht";
            }
        };

        d = new Drink("Cola", "Medium", 5);

        dd = new DrinkDecorator(g,d);
    }

    @Test
    void getPrice() {
        assertEquals(10, dd.getPrice(), 0);
    }
}