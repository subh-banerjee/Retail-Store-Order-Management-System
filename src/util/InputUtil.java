package util;
import java.util.*;
public class InputUtil{
    public static int readInt(Scanner s){
        try{
            return Integer.parseInt(s.next());
        }catch(Exception e){
            return -1;
        }
    }
}
