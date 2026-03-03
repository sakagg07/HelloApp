import java.util.HashMap;
import java.util.Map;

public class BannerApp {

    // Static Inner Class for Pattern Encapsulation
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }
    }

    // CharacterPatternMap to manage mappings
    static class CharacterPatternMap {
        private static final Map<Character, CharacterPattern> patternMap = new HashMap<>();

        static {
            patternMap.put('O', new CharacterPattern('O', new String[]{
                    " ***** ",
                    "**   **",
                    "**   **",
                    "**   **",
                    "**   **",
                    "**   **",
                    " ***** "
            }));

            patternMap.put('P', new CharacterPattern('P', new String[]{
                    "****** ",
                    "**   **",
                    "**   **",
                    "****** ",
                    "**     ",
                    "**     ",
                    "**     "
            }));

            patternMap.put('S', new CharacterPattern('S', new String[]{
                    " ***** ",
                    "**     ",
                    "**     ",
                    " ***** ",
                    "     **",
                    "     **",
                    " ***** "
            }));
        }

        public static String[] getPattern(char ch) {
            return patternMap.get(ch).getPattern();
        }
    }

    public static void main(String[] args) {

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                line.append(CharacterPatternMap.getPattern(ch)[row]);
                line.append("   ");
            }

            System.out.println(line);
        }
    }
}



        