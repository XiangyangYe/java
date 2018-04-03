package error;

import java.io.FileInputStream;
import java.io.IOException;

public class Example_04 {
    private FileInputStream in = null;
    public void readInfo(){
        try{
            in = new FileInputStream("src/com/mingrisoft/CloseIo.java");
            System.out.println("创建IO流，分配内存资源。");
        }catch (IOException io){
            io.printStackTrace();
            System.out.println("创建IO对象发生异常");
        }finally {
            if(in != null){
                try{
                    in.close();
                    System.out.println("关闭IO流，释放内存资源");
                }catch (IOException ioe){
                    ioe.printStackTrace();
                    System.out.println("关闭IO对象发生异常");
                }
            }
        }
    }

    public static void main(String[] args){
        Example_04 ex = new Example_04();
        ex.readInfo();
    }
}
