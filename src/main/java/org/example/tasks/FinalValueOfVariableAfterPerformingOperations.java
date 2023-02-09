package org.example.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 2011. Final Value of Variable After Performing Operations
 * <p>
 * There is a programming language with only four operations and one variable X:
 * <p>
 * ++X and X++ increments the value of the variable X by 1.
 * --X and X-- decrements the value of the variable X by 1.
 * Initially, the value of X is 0.
 * <p>
 * Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
 * <p>
 * Example 1:
 * <p>
 * Input: operations = ["--X","X++","X++"]
 * Output: 1
 * Explanation: The operations are performed as follows:
 * Initially, X = 0.
 * --X: X is decremented by 1, X =  0 - 1 = -1.
 * X++: X is incremented by 1, X = -1 + 1 =  0.
 * X++: X is incremented by 1, X =  0 + 1 =  1.
 * Example 2:
 * <p>
 * Input: operations = ["++X","++X","X++"]
 * Output: 3
 * Explanation: The operations are performed as follows:
 * Initially, X = 0.
 * ++X: X is incremented by 1, X = 0 + 1 = 1.
 * ++X: X is incremented by 1, X = 1 + 1 = 2.
 * X++: X is incremented by 1, X = 2 + 1 = 3.
 * Example 3:
 * <p>
 * Input: operations = ["X++","++X","--X","X--"]
 * Output: 0
 * Explanation: The operations are performed as follows:
 * Initially, X = 0.
 * X++: X is incremented by 1, X = 0 + 1 = 1.
 * ++X: X is incremented by 1, X = 1 + 1 = 2.
 * --X: X is decremented by 1, X = 2 - 1 = 1.
 * X--: X is decremented by 1, X = 1 - 1 = 0.
 */
public class FinalValueOfVariableAfterPerformingOperations {

    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for (String operation : operations){
            if(operation.equals("--X") || operation.equals("X--"))
                res-=1;
            else
                res+=1;
        }
        return res;
    }

    @Test
    public void test() {
        Assertions.assertEquals(1, finalValueAfterOperations(new String[]{"--X", "X++", "X++"}));
        Assertions.assertEquals(3, finalValueAfterOperations(new String[]{"++X", "++X", "X++"}));
        Assertions.assertEquals(0, finalValueAfterOperations(new String[]{"X++", "++X", "--X", "X--"}));
    }
}
