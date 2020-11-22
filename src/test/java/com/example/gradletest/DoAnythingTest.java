package com.example.gradletest;

import org.junit.Assert;
import org.junit.Test;

public class DoAnythingTest {

    @Test
    public void breakDashesTest() {
        String phrase = "just-a-test";
        String[] words = DoAnything.breakDashes(phrase);
        Assert.assertEquals(2, words.length);
    }
}
