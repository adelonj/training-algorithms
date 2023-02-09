package org.example.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        char[] arr = s.toCharArray();

        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<>();
        for (Character c : arr) {
            if (map.containsKey(c)) {
                stack.push(c);
                continue;
            } else if (stack.empty()) {
                return false;
            }
            char top = stack.pop();
            if (c != map.get(top))
                return false;
        }
        return stack.empty();
    }

    @Test
    public void testPositive() {
        Assertions.assertTrue(isValid("()"));
        Assertions.assertTrue(isValid("()[]{}"));
        Assertions.assertTrue(isValid(""));
        Assertions.assertTrue(isValid("{[]}"));
        Assertions.assertTrue(isValid("[[]{}]"));
        Assertions.assertTrue(isValid("[[]{()}]"));
    }

    @Test
    public void testNegative() {
        Assertions.assertFalse(isValid("(]"));
        Assertions.assertFalse(isValid("()[}"));
        Assertions.assertFalse(isValid(")("));
        Assertions.assertFalse(isValid("{([)]}"));
        Assertions.assertFalse(isValid("([}}])"));
        Assertions.assertFalse(isValid("[({])}"));
    }
}
