package javatest.util;

public class StringUtil {

    public static String repeat(String str,int repet){
        if(repet<0){
            throw  new IllegalArgumentException("valor negativo no valido");
        }
        String result="";
        for (int i = 0; i < repet; i++) {
            result=str+result;
        }
        return result;
    }
}
