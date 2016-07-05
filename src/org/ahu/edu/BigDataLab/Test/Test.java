package org.ahu.edu.BigDataLab.Test;

/**
 * Created by plutolove on 16-7-3.
 */

public class Test {
    public static String solve(String str) {
        String res = "";
        char ch = str.charAt(0);
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            if(ch == str.charAt(i)) {
                count++;
            }else {
                if(count>1) {
                    res = res+count+ch;
                }else res = res+ch;
                ch = str.charAt(i);
                count = 1;
            }
        }
        if(count>1) {
            res = res+count+ch;
        }else res = res+ch;
        return res;
    }
    public static void main(String[] args) throws Exception {
        TestHdfsWrite.test();
    }
}