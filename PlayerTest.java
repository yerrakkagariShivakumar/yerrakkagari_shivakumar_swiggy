package com.swiggy.assignment;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PlayerTest {
    @Test
    public void testAttack() {
        Player player = new Player(50, 5, 10);
        int attackRoll = player.attack();
        assertTrue("Attack roll should be between 1 and 6", attackRoll >= 1 && attackRoll <= 6);
    }
    @Test
    public void testDefend() {
        Player player = new Player(100, 5, 10);
        int defenseRoll = player.defend();
        assertTrue("Defense roll should be between 1 and 6", defenseRoll >= 1 && defenseRoll <= 6);
    }
}
