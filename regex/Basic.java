import java.util.*;
import java.util.regex.*;
public class Basic {
    public static void main(String[] args) {
        int v=0;
Pattern p=Pattern.compile("ab");
Matcher m=p.matcher("ababababababab");
while (m.find())
    v++;
        System.out.println(v+" tims");
    }
}
