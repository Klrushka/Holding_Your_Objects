package task16;

import jdk.jshell.execution.Util;

import java.io.*;
import java.util.*;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UniqueWords {
    Set<String> words = new LinkedHashSet<>();
    Set<Character> vowels = new HashSet<>();
    private String path;









    public String[] readFile(){


        Properties properties = new Properties();
        FileInputStream stream;

        try {
            stream = new FileInputStream("src\\app.properties");
            properties.load(stream);
            path = properties.getProperty("path");
        } catch (IOException e) {
            e.printStackTrace();
        }


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
        String regex = ".*[aeiouAEIOU]*.";
        Pattern pattern = Pattern.compile(regex);

        Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'U', 'Y');

        for (int i = 0; i < str.length; i++) {
            // todo fix
            MatchResult matcher = pattern.matcher(str[i]);
            vowelsInWord = matcher.groupCount();
            allVowels += vowelsInWord;

            System.out.println("vowels in " + i + " word: " + vowelsInWord);
            vowelsInWord = 0;
        }
        System.out.println("All vowels: " + allVowels);
    }

}
