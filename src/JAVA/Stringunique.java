package JAVA;

import java.lang.reflect.Array;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.CheckedOutputStream;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-31
 */
public class Stringunique {
    public static void main(String[] args) {
        String[] str="aaazzzzzxxxxxeeeeeeddddddddaaaaabbbbbbbcccccdxfghjjjj".split("");


        List<String> list = Arrays.asList(str);
//        调用Arrays.asList()生产的List的add、remove方法时报异常，这是由Arrays.asList() 返回的市Arrays的内部类ArrayList，
//        而不是java.util.ArrayList。Arrays的内部类ArrayList和java.util.ArrayList都是继承AbstractList，
//        remove、add等方法AbstractList中是默认throw UnsupportedOperationException而且不作任何操作。java.util.ArrayList重新了这些方法而Arrays的内部类ArrayList没有重新，所以会抛出

        List strlist=new LinkedList(list);
        //换成linkedlist也没问题！！！
        System.out.println(list);


        for(int i=0;i<strlist.size();i++){
            System.out.println(strlist.get(i));
            while (i+1<strlist.size()&&strlist.get(i+1).equals(strlist.get(i))){
                strlist.remove(i+1);
            }
        }
        //按顺序！！！！成功去重！！！
        System.out.println(strlist.toString());

        String ss=String.join("",strlist);
        //String join用法！！！
        System.out.println(ss);
    }
}
