package InputOutput;

import java.awt.*;
import java.io.File;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;


public class FTest extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel jContentPane = null;                              //创建面板对象
    private JTextArea jTextArea = null;                              //创建文本域对象
    private JPanel controlPanel = null;                              //创建面板对象
    private JButton openButton = null;                               //创建按钮对象
    private JButton closeButton = null;                              //创建按钮对象
//======================省略了对窗体进行布局的代码==========================================
    private JButton getOpenButton(){
        if(openButton == null){
            openButton = new JButton();
            openButton.setText("写入文件");
            openButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    File file = new File("Word.txt");
                    try{
                        FileWriter out = new FileWriter(file);
                        String s = jTextArea.getText();
                        out.write(s);
                        out.close();
                    }catch (Exception e1){
                        e1.printStackTrace();
                    }
                }
            });
        }
        return openButton;
    }

    private JButton getCloseButton(){
        if(closeButton == null){
            closeButton = new JButton();
            closeButton.setText("读取文件");
            closeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    File file = new File("Word.txt");
                    try{
                        FileReader in = new FileReader(file);
                        char byt[] = new char[1024];
                        int len = in.read(byt);
                        jTextArea.setText(new String(byt,0,len));
                        in.close();
                    }catch (Exception e1){
                        e1.printStackTrace();
                    }
                }
            });
        }
        return closeButton;
    }

    public FTest(){
        super();
        initialize();
    }

    public void initialize(){
        this.setSize(300,200);
        this.setContentPane(getContentPane());
        this.setTitle("JFrame");
    }

    private JPanel getJContentPane(){
        if(jContentPane == null){
            jContentPane = new JPanel();
            jContentPane.setLayout(new BorderLayout());
            jContentPane.add(new JTextArea(),BorderLayout.CENTER);
            jContentPane.add(controlPanel,BorderLayout.SOUTH);
        }
        return jContentPane;
    }

    public static void main(String[] args){
        FTest thisClass = new FTest();
        thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        thisClass.setVisible(true);
    }
}
