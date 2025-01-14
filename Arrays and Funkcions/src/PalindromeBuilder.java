public class PalindromeBuilder {
    public static void main(String[] args) {
        String input = "greenfox";
        System.out.println(build(input));
    }
    public static String build(String temp) {
       char[] toBuild = temp.toCharArray();
        for(int i = 0; i <= toBuild.length; i++)
        {
            toBuild[i] = temp.charAt(temp.length() - i);
        }
        temp += toBuild;
        return temp;
    }
}
