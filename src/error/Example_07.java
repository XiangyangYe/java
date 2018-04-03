package error;

import java.io.FileReader;
import java.io.IOException;

public class Example_07 {
    private FileReader read = null;
    public void createFile() throws Exception{
        read = new FileReader("src/error/Example_07.java");
        System.out.println("分配内存资源 ");
    }

    public void test(){
        try{
            createFile();
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("创建IO对象异常");
        }finally {
            if(read != null){
                try{
                    read.close();
                    System.out.println("释放内存资源");
                }catch (IOException e){
                    e.printStackTrace();
                    System.out.println("关闭IO对象异常");
                }
            }
        }
    }

    public static void main(String[] args){
        Example_07 ex = new Example_07();
        ex.test();
    }

}
