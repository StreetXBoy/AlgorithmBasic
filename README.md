# AlgorithmBasic

## 面试手撕总结

java string 和 int 互相转换

string  转 int :

1、 int i = Integer.parseInt([String]); 或 i = Integer.parseInt([String],[int radix]);
2、 int i = Integer.valueOf(my_str).intValue();


int  转  string :

1、String s = String.valueOf(i);
2、String s = Integer.toString(i);
3、String s = "" + i;

hashmap 不用判断空用于 0 ++

getOrDefault() 方法获取指定 key 对应对 value，如果找不到 key ，则返回设置的默认值。

getOrDefault() 方法的语法为：

String value1 = sites.getOrDefault(1, "Not Found");


