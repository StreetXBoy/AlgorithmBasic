package JAVA;

import java.util.Scanner;

/**
 * @author 重新做人idea基础学习
 * @date 2020-11-25
 */
public class Initial_problem {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();

        //动态分配！！
        String[] books =new String[n];
        books[0]="Java";
        books[0]="C++";
        books[0]="Golang";
        System.out.println(books.length);
        System.out.println(books[6]);
        //注意不是length（）   也不是size！！！！1
        //100
        //100
        //null!!!!






    }
}
