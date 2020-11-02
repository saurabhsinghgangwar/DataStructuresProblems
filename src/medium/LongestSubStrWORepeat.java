package medium;

import java.util.*;

public class LongestSubStrWORepeat {
 static final int NO_OF_CHARS = 256;

        static int longestUniqueSubstring(String str)
        {
            int n = str.length();

            int res = 0; // result

            // last index of all characters is initialized
            // as -1
            int [] lastIndex = new int[NO_OF_CHARS];
            Arrays.fill(lastIndex, -1);

            int i = 0;

            for (int j = 0; j < n; j++) {

                i = Math.max(i, lastIndex[str.charAt(j)] + 1);

                res = Math.max(res, j - i + 1);

                lastIndex[str.charAt(j)] = j;
            }
            return res;
        }

        public static void main(String[] args)
        {
            String str = "pwwkew";
            System.out.println("The input string is " + str);
            int len = longestUniqueSubstring(str);
            System.out.println("The length of "
                    + "the longest non repeating character is " + len);
        }

}
/**
 Given a string s, find the length of the longest substring without repeating characters.



 Example 1:

 Input: s = "abcabcbb"
 Output: 3
 Explanation: The answer is "abc", with the length of 3.
 Example 2:

 Input: s = "bbbbb"
 Output: 1
 Explanation: The answer is "b", with the length of 1.
 Example 3:

 Input: s = "pwwkew"
 Output: 3
 Explanation: The answer is "wke", with the length of 3.
 Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 Example 4:

 Input: s = ""
 Output: 0


 Constraints:

 0 <= s.length <= 5 * 104
 s consists of English letters, digits, symbols and spaces.
 **/
