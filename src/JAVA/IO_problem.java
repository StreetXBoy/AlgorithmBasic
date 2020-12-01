package JAVA;

import sun.plugin2.gluegen.runtime.BufferFactory;
import sun.plugin2.gluegen.runtime.StructAccessor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
    public static void main(String[] args) throws IOException {
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
        System.out.printf("%5.2f\n",a);

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line=br.readLine();
        System.out.println(line);

//        1312312312c 312312
//        1312312312c 312312


        Scanner scanner =new Scanner(System.in);
        String line1 = scanner.nextLine();
        System.out.println(line1);

//        next():只读取输入直到空格。它不能读两个由空格或符号隔开的单词。此外，next()在读取输入后将光标放在同一行中。(next()只读空格之前的数据,并且光标指向本行)
//
//        nextLine():读取输入，包括单词之间的空格和除回车以外的所有符号(即。它读到行尾)。读取输入后，nextLine()将光标定位在下一行.单独string next



    }
}
