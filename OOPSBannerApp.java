public class OOPSBannerApp {

    public static void main(String[] args) {

        // UC5: Declaration + Initialization using String.join()
        String[] banner = {
            String.join("   ", " ***** ", " ***** ", "****** ", " ***** "),
            String.join("   ", "**   **", "**   **", "**   **", "**    "),
            String.join("   ", "**   **", "**   **", "**   **", "**    "),
            String.join("   ", "**   **", "**   **", "****** ", " ***** "),
            String.join("   ", "**   **", "**   **", "**     ", "     **"),
            String.join("   ", "**   **", "**   **", "**     ", "     **"),
            String.join("   ", " ***** ", " ***** ", "**     ", " ***** ")
        };

        // Enhanced for loop (UC5 requirement)
        for (String line : banner) {
            System.out.println(line);
        }
    }
}





        