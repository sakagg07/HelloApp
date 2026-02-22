public class BannerApp {

    public static String buildLine(String... parts) {
        return String.join("", parts);
    }

    public static void main(String[] args) {

        String line1 = buildLine("***   ", "***  ", "****  ", "****");
        String line2 = buildLine("*  * ", "*  *  ", "*   * ", "*");
        String line3 = buildLine("*  * ", "*  *  ", "****   ", "***");
        String line4 = buildLine("*  * ", "*  *  ", "*         ", "*");
        String line5 = buildLine("***   ", "***  ", "*      ", "****");

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}