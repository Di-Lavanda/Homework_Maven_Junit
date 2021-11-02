package ru.ibs;

import junit.framework.TestCase;
import org.junit.Test;

public class App2Test extends TestCase {
private App2 app2 = new App2();
@Test
    public void testConverter(){

    assertEquals("Fizz", app2.converter("3"));
    assertEquals("Buzz", app2.converter("5"));
    assertEquals("FizzBuzz", app2.converter("15"));
}
}