package JAVA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-31
 */
public class ListProblem {
    public static void main(String[] args) {
        List<Integer> list =new LinkedList<>();
        for(int i=1;i<=10;i++){
            list.add(i);
        }
        Iterator iter =  list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        //通用遍历方法iter迭代器

        int delindex=0;
        System.out.println(list);
        for(int i=0;i<10;i++){
            delindex+=2;
            if(delindex>=list.size()){
                delindex=delindex%list.size();
            }
            System.out.println("del element: "+list.get(delindex));
            list.remove(delindex);
            System.out.println(list);
        }
        //完美解决约瑟夫环问题！！！！！！加油！！！！
    }
}
