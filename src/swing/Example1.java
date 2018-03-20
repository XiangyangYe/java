package swing;
import java.awt.*;
import javax.swing.*;

public class Example1 extends JFrame{                                 //定义一个类继承JFrame
    public void CreateJFrame(String title){                           //定义一个CreateJFrame的方法
        JFrame jf = new JFrame(title);                               //实例化一个JFrame对象
        Container container = jf.getContentPane();                   //获取一个容器
        JLabel jl = new JLabel("我是传奇叶向阳");               //创建一个标签

        jl.setFont(new java.awt.Font("Dialog", 1, 38)); //设置字体大小
        jl.setForeground(Color.red);                                       //设置字体颜色

        jl.setHorizontalAlignment(SwingConstants.CENTER);           //使标签上的文字居中
        container.add(jl);                                          //添加标签到容器中
        container.setBackground(Color.white);                       //设置容器的背景颜色
        jf.setVisible(true);                                        //使窗体可视
        jf.setSize(1600,900);                                       //设置窗体大小
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //设置窗体关闭方式
    }

    public static void main(String[] args){
        new Example1().CreateJFrame("创建一个JFrame窗体");     //在主方法中调用CreateJFrame的方法
    }
}
