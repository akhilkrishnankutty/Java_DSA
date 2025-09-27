package Strings.StringBuilder;

public class Allmethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Akhil");
        System.out.println(sb);

        System.out.println(sb.charAt(2));
        sb.setCharAt(2,'k');
        System.out.println(sb);

        sb.append("kkk");
        System.out.println(sb);

        sb.replace(1,2,"ssf");
        System.out.println(sb);

        sb.insert(4,'l');
        System.out.println(sb);

        sb.deleteCharAt(4);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(1,2);
        System.out.println(sb);
    }



}
