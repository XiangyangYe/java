package String;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FormatNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个数字： ");
        double number = scan.nextDouble();
        System.out.println("Locale 类的常量作为构造参数获得不同的货币格式： ");
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("Locale.CHINA: " + format.format(number));
    }
}
