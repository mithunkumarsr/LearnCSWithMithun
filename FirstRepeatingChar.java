
/******************************************************************************
CS Tutorial for Childrenss
Author: SRMK


*******************************************************************************/
import java.util.*;

public class FirstRepeatingChar {

    public static char findFirstRepeating(char str[]) {
        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i <= str.length; i++) {
            char c = str[i];
            if (hs.contains(c)) {
                return c;
            } else
                hs.add(c);
        }
        return '\0';
    }

    public static void main(String[] args) {
        String str = "idodldkd";
        char[] arr = str.toCharArray();
        System.out.println(findFirstRepeating(arr));
    }
}
