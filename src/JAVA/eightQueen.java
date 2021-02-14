package JAVA;

/**
 * @author 重新做人idea基础学习
 * @date 2021-2-14
 */

public class eightQueen {
    public static void main(String[] args) {
        int[][] m = new int[8][8];
        back_track(0,m);

    }

    public  static   boolean check(int row, int col, int[][] m){
        boolean ans=true;
        for(int i=0;i<8;i++){
            if(m[row][i]==1){
                return false;
            }
        }
        for(int j=0;j<8;j++){
            if (m[j][col]==1){
                return  false;
            }
        }
        for(int i=0;row+i<8&&col+i<8;i++){
            if(m[row+i][col+i]==1){
                return false;
        }
        }
        for(int i=0;row-i>=0&&col-i>=0;i++){
            if( m[row-i][col-i]==1){
                return  false;
            }
        }
        return  ans;
    }

    public  static  void back_track(int row,int [][] m){
        if(row==8){
            System.out.println("method find！");
        }else{
            for(int col=0;col<8;col++){
                if(check(row, col, m)){
                    m[row][col]=1;
                    back_track(row+1,m);
                    m[row][col]=0;//最为关键的一步？？？为啥要=0失败了表示不能走   回退！！！！
                }

            }
        }
    }

}
