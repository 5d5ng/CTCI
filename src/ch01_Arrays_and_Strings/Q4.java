package ch01_Arrays_and_Strings;

import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        System.out.println(isPermutationOfPalindrome("Tact coa"));

    }
    public static boolean isPermutationOfPalindrome(String s){
        s = s.replaceAll(" ","");
        s = s.toLowerCase();
        ArrayList<String> lst = new ArrayList<String>();
        boolean[] visit = new boolean[s.length()];
        permutation(lst,s,"",0,visit);

        for(String target:lst){
            if(isPalindrome(target)) return true;
        }
        return false;
    }

    public static void permutation(ArrayList<String> list,String s,String now,int depth,boolean[] vis){
        if(depth == s.length()){

            list.add(now);
            now = "";
            return;
        }
        for (int i = 0; i < s.length() ; i++) {
            if(!vis[i]){
                vis[i] = true;
                permutation(list,s,now+s.charAt(i),depth+1,vis);
                vis[i] = false;
            }
        }
    }

    public static boolean isPalindrome(String s){
        String target = "";
        for (int i = s.length()-1; i>=0 ; i--) {
            target+=s.substring(i,i+1);
        }
        return target.equals(s);
    }


}
