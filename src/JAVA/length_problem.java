package JAVA;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 重新做人idea基础学习
 * @date 2020-11-25
 */
public class length_problem {

    public static void main(String[] args) {
        String s1=new String("123");
        String [] s2={"a","b","c","d","e"};
        List<String> list =new ArrayList<>();
        list.add("12");
        list.add("123");
        System.out.println(s1.length());
        System.out.println(s2.length);
        System.out.println(list.size());

        //length() 方法，length 属性和 size() 方法的区别:
        //
        //1、length() 方法是针对字符串来说的，要求一个字符串的长度就要用到它的length()方法；
        //2、length 属性是针对 Java 中的数组来说的，要求数组的长度可以用其 length 属性；
        //3、Java 中的 size() 方法是针对泛型集合说的, 如果想看这个泛型有多少个元素, 就调用此方法来查看!
    }
}
