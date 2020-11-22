package com.example.gradletest;

import org.junit.Assert;
import org.junit.Test;

public class DoAnythingTest {

    @Test
    public void breakDashesTest() {
        String phrase = "just-a-test-run";
        String[] words = DoAnything.breakDashes(phrase);
        Assert.assertEquals(4, words.length);
    }
}
