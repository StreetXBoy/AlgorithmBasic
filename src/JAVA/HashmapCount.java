package JAVA;

import java.util.*;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-31
 */

//注意如何遍历hashmap！！！

public class HashmapCount {
    public static void main(String[] args) {
        Map<Integer,Integer>map =new HashMap<>();
        int count=0;
        for(int i=1;i<=10;i++){
            if(map.containsKey(1)){
                map.put(1,map.get(1)+1);
                map.put(2,map.get(2)+2);
                map.put(3,map.get(3)+3);
                map.put(4,map.get(4)+4);
                map.put(5,map.get(5)+5);
            }else{
                map.put(1,1);
                map.put(2,2);
                map.put(3,3);
                map.put(4,4);
                map.put(5,5);
            }
        }

        map.remove(4);
        //如何删除！！！！！！！

        Collection values=map.values();
        Collection keys=map.keySet();
        Collection entry =map.entrySet();
        //如何获取所有key值和value值以及集合值！！！！

        Iterator iter= values.iterator();
        while (iter.hasNext()){
            System.out.print("iter :"+iter.next()+"\n");
        }


        System.out.println(entry);
        //1=10, 2=20, 3=30, 4=40, 5=50]等号链接！！！！！
        System.out.println(keys);
        System.out.println(values);
        System.out.println(count);
        System.out.println(map.get(1));
    }
}
