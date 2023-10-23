import java.util.*;
import java.util.regex.*;
public class phone_no {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = s1.nextLine();
        }
        int j=0;
        for (j = 0; j < n; j++) {
            Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
            Matcher m = p.matcher(s[j]);
            if (m.find() && m.group().equals(s[j]))
                System.out.println("vali numbr");
            else
                System.out.println("invali numbr");
        }

    }
}
