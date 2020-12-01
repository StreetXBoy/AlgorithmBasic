package JAVA;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-30
 */
public class RadixAlgorithm {
    public static void main(String[] args) {

        String n="-2";
        String res=transradix(n,10,-2);
        System.out.println(res);
    }


//负数和负的进制也可以！！！！！

static public String transradix(String str,int fromradix,int toradix){
        int n=Integer.valueOf(str,fromradix);
        StringBuilder sb=new StringBuilder();
        while (n!=0){
            if(n%toradix>=10){
                char temp= (char) (n%toradix-10+'A');
                sb.append(temp);
            }else{
                sb.append(n%toradix);
            }
            n/=toradix;
        }
        return  sb.reverse().toString();
    }
}
