package error;

public class Example_01 {
    private int num=10;
    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public Example_01(){
        try{
            Class.forName("com.mingrisoft.Test");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("测试。");
    }

    public static void main(String[] args){
        Example_01 exam = new Example_01();
        exam.setNum(888);
        System.out.println(exam.getNum());
    }
}
