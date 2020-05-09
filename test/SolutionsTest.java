package test;
import src.Solutions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class SolutionsTest {

    private Solutions sol;

    @BeforeEach
    public void setup() {
        System.out.println("Started testing...");
        sol = new Solutions();
    }

    @AfterAll
    public static void finish() {
        System.out.println("All tests finished.");
    }

    @Test
    public void firstUniqCharTest() {
        assertEquals(1, sol.firstUniqChar("test"));
        assertEquals(0, sol.firstUniqChar("leetcode"));
        assertEquals(-1, sol.firstUniqChar("leetcodelcdto"));
    }

    @Test
    public void twoSumTest() {
        assertArrayEquals(new int[] {0,1}, sol.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[] {0,3}, sol.twoSum(new int[]{2, 7, 3, 24}, 26));
    }

    @Test
    public void lengthOfLongestSubstringTest() {
        assertEquals(3, sol.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, sol.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, sol.lengthOfLongestSubstring("pwwkew"));
        assertEquals(1, sol.lengthOfLongestSubstring(" "));
        assertEquals(2, sol.lengthOfLongestSubstring("aab"));
        assertEquals(2, sol.lengthOfLongestSubstring("abb"));
        assertEquals(2, sol.lengthOfLongestSubstring("abba"),"abba");
    }

    @Test
    public void majorityElementTest() {
        assertEquals(3, sol.majorityElement(new int[]{3,2,3}));
        assertEquals(2, sol.majorityElement(new int[]{2,2,1,1,1,2,2}));
        assertEquals(1, sol.majorityElement(new int[]{1}));
    }

    @Test
    public void isPerfectSquareTest() {
        assertEquals(true, sol.isPerfectSquare(25));
        assertEquals(true, sol.isPerfectSquare(2));
        assertEquals(true, sol.isPerfectSquare(0));
        assertEquals(true, sol.isPerfectSquare(1));
        assertEquals(false, sol.isPerfectSquare(3));
        assertEquals(true, sol.isPerfectSquare(46340*46340));
        assertEquals(false, sol.isPerfectSquare(90));
    }

}