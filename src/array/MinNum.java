package array;

public class MinNum {
    public static void main(String[] args){
        int[] num = {34,4,3,7,19,20,4};
        System.out.println("输出一维数组： ");
        for(int i=0; i<num.length;i++){
            System.out.print(num[i] + " ");
        }
        int min = num[0];
        for(int j=0; j<num.length-1; j++){
            if(min > num[j+1]){
                min = num[j+1];
            }
        }
        System.out.println("\n一维数组中的最小值是 " + min);
    }
}
