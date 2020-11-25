package JAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author 重新做人idea基础学习
 * @date 2020-11-25
 */
public class CollectionVS_Arrays {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("g");
        list.add("c");
        list.add("x");

        for(String a :list){
            System.out.println(a);
        }
        //有序的！！

        String[] str ={"a","b","c"};
        List<String> list1= Arrays.asList(str);

        for(String a :list1){
            System.out.println(a);
        }
        //数组转换为List  Arrays.asList!!!

        String [] str1=new String[list1.size()];
        for (int i = 0; i <list1.size() ; i++) {
            str1[i]=list1.get(i);
        }
        //注意是get(i)与C++不同！！！
        System.out.println(str1);


        //asList这不是最好的，因为asList()返回的列表的大小是固定的。事实上，返回的列表不是java.util.ArrayList，
        // 而是定义在java.util.Arrays中一个私有静态类。我们知道ArrayList的实现本质上是一个数组，
        // 而asList()返回的列表是由原始数组支持的固定大小的列表。这种情况下，如果添加或删除列表中的元素，
        // 程序会抛出异常UnsupportedOperationException。


        String[] str2={"m","n"};
        List<String> list2 =new ArrayList<>();
        Collections.addAll(list2,str2);
        System.out.println(list2);
        // addAll is the best!!!! 放入的意思,往后追加无穷多个！！！！！类似于add
        //addAll()方法用于将所有给定的element( ele )放入给定的集合( co )。
        Collections.addAll(list2,"fuck","chinese",".....","eduction");
        System.out.println(list2);

    }
}
