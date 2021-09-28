import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car c1;
    Car c2;
    @Before
    public void setUp() throws Exception {
        c1 = new Car();
        c2 = new Car("Red");
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(100, c1.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        c1.upgradeSpeed();
        assertEquals(110, c1.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        c1.downgradeSpeed();
        assertEquals(90, c1.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(5, c1.getPrice());
    }

    @Test(timeout = 50)
    public void TestSetMaxSpeed() {
        c1.setMaxSpeed(150);
        assertEquals(150, c1.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetColour() {
        assertEquals("Red", c2.getColour());
    }

    public void TestSetColour() {
        c2.setColour("Yellow");
        assertEquals("Yellow", c2.getColour());
    }
}
