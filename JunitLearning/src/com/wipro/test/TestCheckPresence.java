package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import com.wipro.task.DailyTasks;

public class TestCheckPresence {

    @Test
    public void testCheckPresenceTrue() {
        DailyTasks tasks = new DailyTasks();
        assertTrue(tasks.checkPresence("JUnit makes testing easy", "testing"));
    }

    @Test
    public void testCheckPresenceFalse() {
        DailyTasks tasks = new DailyTasks();
        assertFalse(tasks.checkPresence("JUnit makes testing easy", "hard"));
    }
}
