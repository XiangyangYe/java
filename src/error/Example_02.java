package error;

public class Example_02 {
    int[] number = {100,80,50,70,20,60};
    public void setNumber(int index, int value){
        number[index] = value;
    }

    public int getNum(int index){
        return number[index];
    }

    public static void main(String[] args){
        Example_02 ex = new Example_02();
        int value = ex.getNum(0);
        System.out.println(value);
        //索引值超出数组下标范围
        value = ex.getNum(6);
        System.out.println(value);

        value = ex.getNum(5);
        System.out.println(value);
    }
}
