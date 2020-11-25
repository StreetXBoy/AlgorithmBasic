package JAVA;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author 重新做人idea基础学习
 * @date 2020-11-25
 */
public class StringSort {
    public static void main(String[] args) {
        String[] str={"jack","rose","ray","anna","zax"};
        Arrays.sort(str, Collections.reverseOrder());
        //Collections.reverseOrder降序！！！！!!!


        for(String c:str){
            System.out.println(c);
        }
        //javalamba表达式
        Arrays.sort(str,(s1,s2)->{
            if(s1.compareTo(s2)==0){
                return 0;
            }else if (s1.compareTo(s2)>0){
                return 1;
            }else{
                return  -1;
            }
        });

        for(String c:str){
            System.out.println(c);
        }

        //内部匿名类重写compare函数
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.compareTo(s2)==0){
                    return 0;
                }else if (s1.compareTo(s2)>0){
                    return -1;
                }else{
                    return  1;
                }
            }
        });

        for(String c:str){
            System.out.println(c);
        }

    }
}
