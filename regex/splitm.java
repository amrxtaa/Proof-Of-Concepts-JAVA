import java.util.*;
import java.util.regex.*;

public class splitm {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\s");
        String[] s = p.split("Amrita you can do it");
        for (String s1 : s) {
            System.out.println(s1+" ");
        }
    }
}
