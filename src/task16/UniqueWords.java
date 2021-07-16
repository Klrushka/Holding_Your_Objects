package task16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class UniqueWords {
    Set<String> words = new LinkedHashSet<>();
    Set<Character> vowels = new HashSet<>();
    private String path = "E:\\University\\Programming\\JavaDirectory\\Holding_Your_Objects\\src\\test.txt";

    public String[] readFile(){


        try {
            FileReader reader = new FileReader(new File(path));
            Scanner scanner = new Scanner(reader);

            while(scanner.hasNextLine()){
                words.addAll(Arrays.asList(scanner.nextLine().split(" ")));
            }



        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        return words.toArray(new String[0]);
    }




    public void countVowels(String[] str) {
        int allVowels = 0;
        int vowelsInWord = 0;
        Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'U', 'Y');

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                if (vowels.contains(str[i].toUpperCase(Locale.ROOT).charAt(j))){
                    allVowels++;
                    vowelsInWord++;
                }
            }
            System.out.println("vowels in " + i + " word: " + vowelsInWord);
            vowelsInWord = 0;
        }
        System.out.println("All vowels: " + allVowels);
    }

}
