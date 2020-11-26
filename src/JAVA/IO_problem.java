package JAVA;

import java.util.Scanner;

/**
 * @author 重新做人idea基础学习
 * @date 2020-11-25
 */


//next() 与 nextLine() 区别

//next():
//
//1、一定要读取到有效字符后才可以结束输入。
//2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
//3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
//next() 不能得到带有空格的字符串。

//nextLine()：
//
//1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。


public class IO_problem {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

//        while (scanner.hasNext()){
//            System.out.println("next: "+scanner.next());
//        }
//
//        while (scanner.hasNext()){
//            System.out.println("nextLine: "+scanner.nextLine());
//        }

//        123 456
//        nextLine: 123 456

        double a=9;

        System.out.println(a);
        //类似于C！！！！！！！1
        System.out.printf("%.2f\n",a);
        System.out.printf("%5.2f",a);




    }
}
