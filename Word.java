import java.util.*;

public class Word {

    // List of words
    private static final String[] WORD_LIST = {
            "python", "developer", "programming", "algorithm", "function",
            "variable", "debugging", "compiler", "codechef", "machine",
            "bitcoin", "operation"
    };

    public static String scrambleWord(String word) {
        /** Scramble the letters of a word randomly */
        List<Character> characters = new ArrayList<>();
        for (char c : word.toCharArray()) {
            characters.add(c);
        }
        Collections.shuffle(characters);
        StringBuilder scrambled = new StringBuilder();
        for (char c : characters) {
            scrambled.append(c);
        }
        return scrambled.toString();
    }

    public static void playGame() {
        // Pick a random word
        Random random = new Random();
        String originalWord = WORD_LIST[random.nextInt(WORD_LIST.length)];
        String scrambled = scrambleWord(originalWord);

        System.out.println("\nWelcome to the Word Scramble Game!");
        System.out.println("Scrambled word: " + scrambled);

        int attempts = 3;
        while (attempts > 0) {
            System.out.print("Guess the word: ");
            Scanner scanner = new Scanner(System.in);
            String guess = scanner.next().toLowerCase();

            if (guess.equals(originalWord)) {
                System.out.println("Correct! You guessed it!\n");
                return;
            } else {
                attempts--;
                System.out.println("Wrong guess. Attempts left: " + attempts);
            }
        }
        System.out.println("Game over! The correct word was: " + originalWord);
    }

    public static void main(String[] args) {
        playGame();
    }
}
