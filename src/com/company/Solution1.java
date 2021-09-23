package com.company;

class Solution1 {
    public int solution(int N){
        int temp=0;
        if (N==0) return 0;
        int temp1=0;
        char[] binarynumber = Integer.toBinaryString(N).toCharArray();
        for (int i=0;i<binarynumber.length;i++) {

            if (binarynumber[i]=='0') {
                temp1++;
                continue;

            }
            else if (binarynumber[i]=='1'){
                if (temp<temp1){
                    temp=temp1;
                    temp1=0;
                }
            }
        }
        return temp;

    }
}
