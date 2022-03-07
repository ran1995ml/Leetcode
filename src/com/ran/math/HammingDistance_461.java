package com.ran.math;

/**
 * ClassName: HammingDistance_461
 * Description:
 * date: 2022/2/23 12:34 下午
 *
 * @author ran
 */
public class HammingDistance_461 {
    public int hammingDistance(int x, int y) {
        int ans = x ^ y;
        int count = 0;
        while (ans>0){
            if(ans%2>0){
                count++;
            }
            ans /= 2;
        }
        return count;
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        HammingDistance_461 obj = new HammingDistance_461();
        System.out.println(obj.hammingDistance(x,y));
    }
}
