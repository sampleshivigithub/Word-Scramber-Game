import java.util.*;

public class WordScrambleGame {

    // List of words
    private static final String[] WORD_LIST = {
            "python", "developer", "programming", "algorithm", "function",
            "variable", "debugging", "compiler", "codechef", "machine",
            "bitcoin", "operation"
    };

    public static String scrambleWord(String word) {
        /** Scramble the letters of a word randomly */
        List<Character> characters = new ArrayList<>();

        // Convert word to a list of characters
        for (char ch : word.toCharArray()) {
            characters.add(ch);
        }

        // Shuffle word using Collections.shuffle()
        Collections.shuffle(characters);

        // Join all letters and return
        StringBuilder scrambled = new StringBuilder();
        for (char ch : characters) {
            scrambled.append(ch);
        }

        return scrambled.toString();
    }

    public static void playGame() {
        // Pick a random word
        Random random = new Random();
        String originalWord = WORD_LIST[random.nextInt(WORD_LIST.length)];

        // Scramble the word
        String scrambled = scrambleWord(originalWord);

        System.out.println("\nWelcome to the Word Scramble Game!");
        System.out.println("Original word: " + originalWord);
        System.out.println("Scrambled word: " + scrambled);
    }

    public static void main(String[] args) {
        playGame();
    }
}