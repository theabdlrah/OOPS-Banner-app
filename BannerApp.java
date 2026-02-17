import java.util.HashMap;
import java.util.Map;

class CharacterPattern {

    private Map<Character, String[]> patterns;

    public CharacterPattern() {

        patterns = new HashMap<>();

        patterns.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patterns.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patterns.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    public String[] getPattern(char ch) {
        return patterns.get(Character.toUpperCase(ch));
    }
}

class BannerPrinter {

    private CharacterPattern characterPattern;

    public BannerPrinter() {
        characterPattern = new CharacterPattern();
    }

    public void printBanner(String text) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            for (char ch : text.toCharArray()) {

                String[] pattern = characterPattern.getPattern(ch);

                if (pattern != null) {
                    System.out.print(pattern[i] + "  ");
                }
            }

            System.out.println();
        }
    }
}

public class BannerApp {

    public static void main(String[] args) {

        BannerPrinter printer = new BannerPrinter();

        printer.printBanner("OOPS");

    }
}
