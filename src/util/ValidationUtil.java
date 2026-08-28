package util;
public class ValidationUtil{
    public static boolean isPos(int v){
        return v>0;
    }
    public static boolean valEmail(String e){
        return e.contains("@");
    }
}