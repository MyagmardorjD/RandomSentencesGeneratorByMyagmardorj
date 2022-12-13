package FundamentalsWarmUp.RandomSentencesGeneratorByMyagmardorj;

import java.util.Random;
import java.util.Scanner;

public class randomSentencesGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key;
        boolean condition = true;
        String[] names = {"Peter", "Michell", "Jane", "Steve"};
        String[] places = {"Sofia", "Plovdiv", "Varna", "Burgas"};
        String[] verbs = {"eats", "holds", "sees", "plays with", "brings"};
        String[] nouns = {"stones", "cake", "apple", "laptop", "bikes"};
        String[] adverbs = {"slowly", "diligently", "warmly", "sadly", "rapidly"};
        String[] details = {"near the river", "at home", "in the park"};
        System.out.println("Hello, this is your first random-generated sentence:");
        while(condition){
            String randomName = getRandomWord(names);
            String randomPlaces = getRandomWord(places);
            String randomVerbs = getRandomWord(verbs);
            String randomNouns = getRandomWord(nouns);
            String randomAdverbs = getRandomWord(adverbs);
            String randomDetails = getRandomWord(details);
            System.out.printf("%s from %s %s %s %s %s\n",randomName,randomPlaces,randomAdverbs,randomVerbs,randomNouns,randomDetails);
            System.out.println("Click [Enter] to generate a new one?");
            key = scanner.nextLine();
            if (!key.equals("")) {
                condition = false;
            }
        }
    }
    public static String getRandomWord(String[] words){
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        return words[randomIndex];
    }
}
