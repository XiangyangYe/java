package example;

import java.util.Scanner;

public class CheckLogin {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入登录用户名： ");
        String usernme = scan.nextLine();
        System.out.println("请输入登录密码： ");
        String password = scan.nextLine();
        if(!usernme.equals("vanallen")){
            System.out.println("用户名非法！");
        }else if(!password.equals("xidianyexy")){
            System.out.println("登录密码错误。");
        }else {
            System.out.println("恭喜您，登录信息验证通过！");
        }
    }
}
