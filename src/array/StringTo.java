package array;

import java.util.StringTokenizer;

public class StringTo {
    public static void main(String[] args){
        String text = "  We are students ";
        System.out.println("原来的字符是 ");
        System.out.println(text);
        StringTokenizer st = new StringTokenizer(text," ");
        StringBuffer sb = new StringBuffer();
        int i = 1;
        while(st.hasMoreTokens()){
            i++;
            sb.append(st.nextToken());
        }
        System.out.println("去掉字符串中所有空格之后的字符串是：");
        System.out.println(sb.toString());
    }
}
