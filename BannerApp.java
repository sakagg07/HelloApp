public class BannerApp {
    public static void main(String[] args) {

        // Storing banner lines in a String array (UC4 requirement)
        String[] banner = {
            " ***    ***    ****    **** ",
            "*   *  *   *  *   *  *      ",
            "*   *  *   *  ****    ***   ",
            "*   *  *   *  *          *  ",
            " ***    ***   *       ****  "
        };

        // Using enhanced for-loop to print banner (clean & reusable)
        for (String line : banner) {
            System.out.println(line);
        }
    }
}