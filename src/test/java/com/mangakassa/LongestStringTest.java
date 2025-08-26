package com.mangakassa;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class LongestStringTest {

    private LongestString longestString;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Starting LongestStringTest...");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("All tests finished.");
    }

    @BeforeEach
    void setUp() {
        longestString = new LongestString(); // ✅ instantiation before each test
        System.out.println("Setup before each test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tear down after each test");
    }

    // -------------------------
    // ✅ Test Cases
    // -------------------------

    @Test
    void testFind_withNormalList() {
        List<String> input = Arrays.asList("apple", "banana", "strawberry", "kiwi");
        String result = longestString.find(input);
        assertEquals("strawberry", result);
    }

    @Test
    void testFind_withEmptyList() {
        List<String> input = Collections.emptyList();
        String result = longestString.find(input);
        assertNull(result);
    }

    @Test
    void testFind_withNullList() {
        String result = longestString.find(null);
        assertNull(result);
    }

    @Test
    void testFind_withNullElements() {
        List<String> input = Arrays.asList(null, "cat", "elephant", null, "dog");
        String result = longestString.find(input);
        assertEquals("elephant", result);
    }

    @Test
    void testFind_withEqualLengthStrings() {
        List<String> input = Arrays.asList("cat", "dog", "bat");
        String result = longestString.find(input);
        assertEquals("cat", result); // first longest word must be chosen
    }

    @Test
    void testFind_withSingleElement() {
        List<String> input = Collections.singletonList("onlyOne");
        String result = longestString.find(input);
        assertEquals("onlyOne", result);
    }

    @Test
    void testFind_withAllNulls() {
        List<String> input = Arrays.asList(null, null, null);
        String result = longestString.find(input);
assertEquals("", result); // Because Long~est is initialized to ""
    }
}