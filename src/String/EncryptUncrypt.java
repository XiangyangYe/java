package String;

public class EncryptUncrypt {
    public static String EAndU(String value, char secert){
        byte[] bt = value.getBytes();                             //将需要加密的内容转换为字节数组
        for(int i=0;i<bt.length;i++){
            bt[i] = (byte)(bt[i]^(int)secert);                    //通过异或运算进行加密
        }
        return new String(bt,0,bt.length);
    }

    public static void main(String[] args){
        String value = "我爱 Java";                       //需要加密的内容
        char secret = '祈';                               //密文字符
        System.out.println("元字符串为： " + value);
        String encrypt = EncryptUncrypt.EAndU(value,secret);
        System.out.println("加密后的值： " + encrypt);
        String uncrypt = EncryptUncrypt.EAndU(encrypt,secret);
        System.out.println("解密后的值： " + uncrypt);
    }
}
