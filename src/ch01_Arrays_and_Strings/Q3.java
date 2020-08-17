package ch01_Arrays_and_Strings;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        String str = "Mr John Smith    ";
        char[] arr = str.toCharArray();
//        int trueLength = findLastCharacter(arr) + 1;
        int trueLength = arr.length;
        for(int i = trueLength-1;i>=0;i--){
            if(arr[i]!=' ') {
                trueLength = i+1;
                break;
            }
        }

        replaceSpaces2(arr, trueLength);
        System.out.println(Arrays.toString((arr)));

    }
    public static void replaceSpaces(char[] arr , int length){ //내가 한 풀이
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==' '){
                arr[i] = '%';
                int j = arr.length-3;
                while (j>i){
                    arr[j+2] = arr[j];
                    j--;
                }
                arr[++i] = '2';
                arr[++i] = '0';
            }
        }
    }
    public static void replaceSpaces2(char[]arr , int truelength){
        int spaceCount = 0,index, i = 0;
        for (i=0;i<truelength;i++){
            if(arr[i] == ' '){
                spaceCount++;
            }

        }
        index = truelength + spaceCount*2;//index: 실제로 %20을 추가했을 때 문자열의 길이 실제길이에 공백을 '%'로 바꾸는 것을 제외하고 2개의 문자 '2' '0' 이 더필요하기 때문에 곱하기 2를 해줘야 한다.
        for(i = truelength-1;i>=0;i--)
        {
            if(arr[i]==' '){
                arr[index-1] = '0';
                arr[index-2] = '2';
                arr[index-3] = '%';
                index-=3;
            }else{
                arr[index-1] = arr[i];
                index--;
            }
        }


    }
}
