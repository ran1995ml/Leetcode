package com.ran.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: LetterCombinations_48
 * Description:
 * date: 2022/2/12 16:21
 *
 * @author ran
 */
public class LetterCombinations_17 {
    private String[] numbers = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits.length()==0) return list;
        char[] arr = digits.toCharArray();
        dfs(list,new StringBuffer(),arr,0);
        return list;
    }

    private void dfs(List<String> list,StringBuffer sb,char[] arr,int index) {
        if(index==arr.length){
            list.add(String.valueOf(sb));
            return;
        }
        String letter = numbers[arr[index] - '0'];
        for(int i=0;i<letter.length();i++){
            sb.append(letter.charAt(i));
            dfs(list,sb,arr,index+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        LetterCombinations_17 object = new LetterCombinations_17();
        String digits = "23";
        System.out.println(object.letterCombinations(digits));
    }

}
