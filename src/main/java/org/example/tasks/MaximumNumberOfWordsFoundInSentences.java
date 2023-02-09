package org.example.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 2114. Maximum Number of Words Found in Sentences
 * <p>
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
 * <p>
 * You are given an array of strings sentences, where each sentences[i] represents a single sentence.
 * <p>
 * Return the maximum number of words that appear in a single sentence.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
 * Output: 6
 * Explanation:
 * - The first sentence, "alice and bob love leetcode", has 5 words in total.
 * - The second sentence, "i think so too", has 4 words in total.
 * - The third sentence, "this is great thanks very much", has 6 words in total.
 * Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
 * Example 2:
 * <p>
 * Input: sentences = ["please wait", "continue to fight", "continue to win"]
 * Output: 3
 * Explanation: It is possible that multiple sentences contain the same number of words.
 * In this example, the second and third sentences (underlined) have the same number of words.
 */
public class MaximumNumberOfWordsFoundInSentences {

    public int mostWordsFound(String[] sentences) {
        int i = 0;
        for (String s : sentences) {
            int temp = s.split(" ").length;
            if (i < temp)
                i = temp;
        }
        return i;
    }

    @Test
    public void test() {
        Assertions.assertEquals(6, mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
        Assertions.assertEquals(3, mostWordsFound(new String[]{"please wait", "continue to fight", "continue to win"}));
    }
}
