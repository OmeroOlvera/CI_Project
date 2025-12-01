package org.psnbtech;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;
import org.psnbtech.entity.Asteroid;

public class AsteroidTest {

    @Test
    //public void testAsteroidCreation() {
        Random random = new Random(12345);

        Asteroid asteroid = new Asteroid(random);
        //check to make sure asteroid was created
        assertNotNull(asteroid);
    }
}
