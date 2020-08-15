package ch01_Arrays_and_Strings;

public class Q1 {
    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for(String word:words)
        {
            System.out.println(is_unique(word));
        }
    }
    public static boolean is_unique(String s){
        if(s.length()>128) return false;

        boolean [] chk = new boolean[128];
        for (int i=0;i<s.length();i++){
            int val = s.charAt(i); //아스키 코드로 번호로 나온다.
            if(chk[val]) return false;

            chk[val] = true;
        }
        return true;
    }
}





