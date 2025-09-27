package Strings.StringBuilder;

public class BuilderCon {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("aaabbbbccddde");
        String ans = ""+sb.charAt(0);
        Integer count = 1;
        int laspos = 0;
        for(int i = 1;i<sb.length();i++){
//            count = 0;
            int pre = i-1;
            if(sb.charAt(i)==sb.charAt(pre)) count++;
            else {

                if (count > 1) {
                    ans += count;
//                    count =0;
                }
                count = 1;
                ans += sb.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
