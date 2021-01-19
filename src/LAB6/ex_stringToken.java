package LAB6;

import java.util.StringTokenizer;

public class ex_stringToken {
    public static void main(String[] args) {
        String msg = "I work at RUTS,Nakhonsrithammarat Thailand.";
        StringTokenizer token = new StringTokenizer(msg);

        System.out.println("Word in message "+token.countTokens());

        while (token.hasMoreTokens()){
            System.out.println(token.nextToken());

        }
    }
}