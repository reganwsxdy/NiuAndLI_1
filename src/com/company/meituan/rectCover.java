package com.company.meituan;

public class rectCover {
    public int cover(int target){
        if (target <= 2){
            return target;
        }
        int res = 0;
        int n1 = 1, n2 = 2;
        for (int i = 3; i <= target; i++){
            res = n1 + n2;
            n1 = n2;
            n2 = res;
        }
        return res;
    }
}
