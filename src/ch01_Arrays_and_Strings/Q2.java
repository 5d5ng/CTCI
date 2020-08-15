package ch01_Arrays_and_Strings;

import java.util.Arrays;

public class Q2 {

    public static boolean permutation(String s,String t){
        char [] arrS = s.toCharArray();
        char [] arrT = t.toCharArray();
        Arrays.sort(arrS);
        Arrays.sort(arrT);
        for (int i = 0; i < arrS.length; i++) {
            if(arrS[i]!=arrT[i]) return false;
        }
        return true;

    }
    public static void main(String[] args) {
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean anagram = permutation(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + anagram);
        }
    }
}
