package Strings;

public class StringChange {
    public static void main(String[] args) {
        String h = "Hello";
//        Change it into helko
        h = h.substring(0,2)+"k"+h.substring(4);
        System.out.println(h);
    }

}
