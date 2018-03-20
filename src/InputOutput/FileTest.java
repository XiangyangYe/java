package InputOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//public class FileTest {
//    public static void main(String[] args){
//        File file = new File("Word.txt");
//        if(file.exists()){
//            file.delete();
//            System.out.println("文件已删除");
//        }
//        else{
//            try{
//                file.createNewFile();
//                System.out.println("文件已创建");
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        }
//    }
//}
//=========================================================================================================
//public class FileTest{
//    public static void main(String[] args){
//        File file = new File("Word.txt");
//        if(file.exists()){
//            String name = file.getName();
//            long length = file.length();
//            boolean hidden = file.isHidden();
//            System.out.println("文件名称： " + name);
//            System.out.println("文件长度是： " + length);
//            System.out.println("该文件是隐藏文件吗？ " + hidden);
//        }else {
//            System.out.println("该文件不存在");
//        }
//    }
//}
//===========================================================================================================
//写入数据并读取

public class FileTest{
    public static void main(String[] args){
        File file = new File("Word.txt");
        try{
            FileOutputStream out = new FileOutputStream(file);
            byte buy[] = "我有一只小毛驴，我从来也不骑。".getBytes();
            out.write(buy);
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            FileInputStream in = new FileInputStream(file);
            byte byt[] = new byte[1024];
            int len = in.read(byt);
            System.out.println("文件中的信息是： " + new String(byt,0,len));
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}