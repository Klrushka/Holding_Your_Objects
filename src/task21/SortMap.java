package task21;

import task16.UniqueWords;

import java.security.PublicKey;
import java.util.*;

public class SortMap {
    private List<String> words = new ArrayList<>();
    private Map<String,Integer> wordsMap = new HashMap<>();
    private UniqueWords uniqueWords = new UniqueWords();
    String regex = "[^aeiouyAEIOUY]";

    public void start(){
        words.addAll(Arrays.asList(uniqueWords.readFile()));

        Collections.sort(words,String.CASE_INSENSITIVE_ORDER);


        int allVowels = 0;
        int vowelsInWord = 0;

        for (int i = 0; i < words.size(); i++) {
            vowelsInWord = words.get(i).replaceAll(regex,"").length();
            allVowels += vowelsInWord;

            wordsMap.put(words.get(i),vowelsInWord);
            vowelsInWord = 0;
        }

        System.out.println(wordsMap);
        System.out.println(wordsMap.size() + " words");
    }
}
