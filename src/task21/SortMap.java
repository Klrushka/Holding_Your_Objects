package task21;

import task16.UniqueWords;

import java.security.PublicKey;
import java.util.*;

public class SortMap {
    private List<String> words = new ArrayList<>();
    private Map<String,Integer> wordsMap = new HashMap<>();
    private UniqueWords uniqueWords = new UniqueWords();
    private Set<Character> vowels = new HashSet<>();

    public void start(){
        words.addAll(Arrays.asList(uniqueWords.readFile()));

        Collections.sort(words,String.CASE_INSENSITIVE_ORDER);


        int allVowels = 0;
        int vowelsInWord = 0;
        Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'U', 'Y');

        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.get(i).length(); j++) {
                if (vowels.contains(words.get(i).toUpperCase(Locale.ROOT).charAt(j))){
                    allVowels++;
                    vowelsInWord++;
                }
            }
            wordsMap.put(words.get(i),vowelsInWord);
            vowelsInWord = 0;
        }

        System.out.println(wordsMap);
        System.out.println(words.size() + " words");
    }
}
