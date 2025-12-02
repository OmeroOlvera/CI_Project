package org.psnbtech;

import static org.junit.Assert.*;
import org.junit.Test;
import org.psnbtech.entity.Bullet;
import org.psnbtech.entity.Entity;
import org.psnbtech.util.Vector2;

public class BulletTest {

    private static class TestEntity extends Entity {
        public TestEntity(Vector2 position) {
            super(position, new Vector2(0, 0), 0, 0);
        }
        @Override public void update(Game game) {}
        @Override public void handleCollision(Game game, Entity other) {}
        @Override public void draw(java.awt.Graphics2D g, Game game) {}
    }

    //test spawn point of bullet
    @Test
    public void testBulletCreatesSuccessfully() {
        TestEntity owner = new TestEntity(new Vector2(10, 20));
        Bullet bullet = new Bullet(owner, 0.0);

        assertEquals(10.0, bullet.getPosition().x, 0.001);
        assertEquals(20.0, bullet.getPosition().y, 0.001);
    }
}
