package com.ran.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: GenerateParenthesis
 * Description:
 * date: 2022/2/12 16:41
 *
 * @author ran
 */
public class GenerateParenthesis_22 {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        dfs(list,new StringBuffer(),n,0,0);
        return list;
    }
    private void dfs(List<String> list,StringBuffer sb,int n,int l,int r){
        if(l==n&&r==n){
            list.add(String.valueOf(sb));
            return;
        }
        if(l>n||r>n) return;
        if(l<r) return;

        sb.append('(');
        dfs(list,sb,n,l+1,r);
        sb.deleteCharAt(sb.length()-1);
        sb.append(')');
        dfs(list,sb,n,l,r+1);
        sb.deleteCharAt(sb.length()-1);
    }

    public static void main(String[] args) {
        GenerateParenthesis_22 object = new GenerateParenthesis_22();
        System.out.println(object.generateParenthesis(3));

    }
}
