package Project;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - Project
 * Created_on - 14 November-2023
 * Created_at - 12 : 43
 */

public class ExtractMentions {

    private static final Pattern MENTION_PATTERN = Pattern.compile("@[a-zA-Z0-9_.-]+");
    private static final Pattern HASHTAG_PATTERN = Pattern.compile("#[a-zA-Z0-9_.-]+");

    public static Set<String> extractMentions(String input) {
        return extractWords(input, MENTION_PATTERN, false);
    }

    public static Set<String> extractHashtags(String input) {
        return extractWords(input, HASHTAG_PATTERN, true);
    }

    private static Set<String> extractWords(String input, Pattern pattern, Boolean isHashtag) {
        Set<String> words = new HashSet<>();
        String[] split = input.split("\\s+");
        for (String data : split) {
            data = removeTrailingPunctuation(data);
            Matcher matcher = pattern.matcher(data);
            if (matcher.matches()) {
                if (isHashtag) {
                    words.add(data);
                } else {
                    words.add(data.substring(1));
                }
            }
        }
        return words;
    }

    private static String removeTrailingPunctuation(String word) {
        if (word.endsWith(".") || word.endsWith(",")) {
            return word.substring(0, word.length() - 1);
        }
        return word;
    }

    public static boolean match(String data) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_-]*$";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(data);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String a = "Hello there, I am #beingrohit.exe developer of Bloggios with @rakesh5_cu., and #sagar-kumar1234";
        // ["#beingrohit.exe", "#kumar-sagar1234"]
        // ["@rakesh5.cu"]
        // [. _ - number]
        System.out.println(extractMentions(a));
        System.out.println(match("g6-5fe_fsv"));
    }
}
