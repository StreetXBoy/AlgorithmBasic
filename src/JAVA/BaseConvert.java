package JAVA;

import java.util.zip.CheckedOutputStream;

/**
 * @author 重新做人idea基础学习
 * @date 2020-11-30
 */


//进制转换

public class BaseConvert {
    public static void main(String[] args) {
        int n=100;
        String a=Integer.toString(n,4);
        //负数不行！！！
        System.out.println(a);
        //java进制转换r进制！！！！
//        Integer.toString(n, r);
//        r进制转10进制
//        Integer.parseInt((String) s,(int) radix);
        int n1=Integer.parseInt(a,4);
        System.out.println(n1);
    }
}
