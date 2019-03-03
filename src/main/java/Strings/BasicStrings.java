package Strings;

import java.util.ArrayList;
import java.util.Collections;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {

        return string2.concat(string1);
    }

    public char getChar(String string, int index) {

        return string.charAt(index);
    }

    public String iCantSee(String string) {
        String strRet = "";
        int i = 0;
        while (i < string.length()) {
            strRet += " ";
            i++;
        }
        return strRet;
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
       String retStr = "";
       for (int i = 0 ;i< string.length();i++){
           if(Character.isLowerCase(string.charAt(i))){
               retStr += Character.toUpperCase(string.charAt(i));
           }
           else
               retStr += Character.toLowerCase(string.charAt(i));
       }
        return retStr;
    }

    public String oneAtATime(String string1, String string2) {
        int len = Math.max(string1.length(),string2.length());
        String str = "";
        for (int i = 0;i<len;i++){
            if(i<string1.length())
            str += string1.charAt(i);
            if(i<string2.length())
                str += string2.charAt(i);
        }
        return str;
    }
}
