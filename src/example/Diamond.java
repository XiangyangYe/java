package example;

public class Diamond {
    public static void main(String[] args){
        printHollowRhombus(10);
    }

    public static void printHollowRhombus(int size){
        if(size % 2 == 0 ){
            size++;                               //计算菱形的大小
        }
        for(int i=0; i< size/2 + 1; i++){
            for(int j=size/2+1; j>i+1; j--){
                System.out.println(" ");         //输出左上角位置的空白
            }
            for(int j=0; j<2*i+1;j++){
                if(j==0 || j==2*j){
                    System.out.println("*");    //输出菱形上半部边缘
                }else {
                    System.out.println(" ");    //输出菱形上半部空心
                }
            }
            System.out.println("");
        }

    }
}
