package org.psnbtech;

import static org.junit.Assert.*;
import org.junit.Test;
import org.psnbtech.util.Vector2;

public class Vector2Test {

    @Test
    public void testVectorAddition() {
        Vector2 a = new Vector2(2.0, 3.0);
        Vector2 b = new Vector2(1.0, 4.0);

        //test addition logic
        Vector2 c = a.add(b);

        assertEquals(3.0, c.x, 0.001);
        assertEquals(7.0, c.y, 0.001);
    }
}
