import org.junit.*;

import static org.junit.Assert.*;


public class HondaTest {
    Honda h;

    @Before
    public void setUp() throws Exception {
        h = new Honda("red", 180, 20000);
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(180, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        h.upgradeSpeed();
        assertEquals(181, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        h.downgradeSpeed();
        assertEquals(179, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(20000, h.getPrice());
    }

}