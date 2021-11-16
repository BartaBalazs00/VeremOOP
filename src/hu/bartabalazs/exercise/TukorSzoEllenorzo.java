package hu.bartabalazs.exercise;

import hu.bartabalazs.Stack.Stack;

import java.lang.reflect.Array;
import java.util.Locale;

public class TukorSzoEllenorzo {

    private static String szo;
    private static Stack<Character> verem;

    public static boolean Run(String beolvasottSzo){
        TukorSzoEllenorzo.szo = beolvasottSzo;

        verem = new Stack<>();


        return isTukorSzoE(beolvasottSzo);
    }

    private static boolean isTukorSzoE(String s){
        verem.empty();
        for (int i = 0; i < s.length()/2; i++) {
            verem.push(s.charAt(i));
        }

        int i = s.length()/2 + s.length()%2;
        while (i<s.length() && s.charAt(i) == verem.pop()){
            i++;
        }

        return i == s.length();
    }

    public static boolean isPalindromE(String mondat){
        String ujMondat = mondat;
        char[] irasJelek = {'.','!', '?', ':', '-', ' ', '\'', '\"'};

        for (char irasJel:irasJelek) {
            ujMondat = ujMondat.replace(irasJel+"", "");
        }

        ujMondat = ujMondat.toUpperCase();

        return isTukorSzoE(ujMondat);
    }
}
