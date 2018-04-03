package error;

public class Example_10 {
    final static double PI = 3.14;
    public void computeArea(double r) throws Exception{
        if(r<20.0){
            throw new Exception("程序异常：\n半径为：" + r + "\n半径不能小于20");
        }else{
            double circleArea = PI*r*r;
            System.out.println("半径是： " + r + "的面积是： " + circleArea);
        }
    }

    public static void main(String[] args){
        Example_10 ex = new Example_10();
        try{
            ex.computeArea(10);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
