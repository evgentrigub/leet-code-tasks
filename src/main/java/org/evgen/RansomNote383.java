package org.evgen;

import java.util.HashMap;

// https://leetcode.com/problems/ransom-note/description/
public class RansomNote383 {
    static void main() {
        var result = canConstruct("arrayString", "magazine");
        System.out.println("Result: "+result);
    }

    static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineLetters = new HashMap<Character, Integer>();

        for (int i = 0; i < magazine.length(); i++) {
            char letter = magazine.charAt(i);

            int currentLetterCount = magazineLetters.getOrDefault(letter, 0);
            magazineLetters.put(letter, currentLetterCount + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char noteLetter = ransomNote.charAt(i);

            var magazineLetterCount = magazineLetters.getOrDefault(noteLetter, 0);
            if (magazineLetterCount == 0){
                return false;
            }

            magazineLetters.put(noteLetter, magazineLetterCount - 1);
        }

        return true;
    }
}
