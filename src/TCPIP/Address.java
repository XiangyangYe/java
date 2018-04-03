package TCPIP;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Address {
    public  static  void main(String[] args){
        InetAddress ip;
        try{
            ip = InetAddress.getLocalHost();
            String localname = ip.getHostName();
            String iplocal = ip.getHostAddress();
            System.out.println("本机名： " + localname);
            System.out.println("本机地址 " + iplocal);
        }catch (UnknownHostException e){
            e.printStackTrace();
        }
    }
}
