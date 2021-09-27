import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import static org.junit.Assert.*;


public class CatTest {
    Cat c;

    @Before
    public void setUp() throws Exception {
        c = new Cat();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Meoww", c.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(7, c.getSpeed());
    }


    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(50, c.getPrice());
    }

}