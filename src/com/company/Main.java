package com.company;
import java.util.*;

class Solution {
    public static int solution(int N){
        if (N<0) return -1;
        if (N==0) return 0;
        List<Integer> list=new ArrayList<>();
        while (N>0){
            list.add(N%10);
            N/=10;

        }
        Collections.sort(list);
        Collections.reverse(list);
        int result = list.get(0);
        for (int i =1;i<list.size();i++){
            result = result*10+list.get(i);
            if (result>10000000){
                return -1;
            }
        }
        return result;
    }

}