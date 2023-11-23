package hashmaps;

import Basics.MethodParameters;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - hashmaps
 * Created_on - 22 November-2023
 * Created_at - 19 : 41
 */

public class HighestFrequencyCharacter {

    public static char process(String data) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : data.toCharArray()) frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        Map.Entry<Character, Integer> maxEntry = frequencyMap.entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null);
        return (maxEntry!=null) ? maxEntry.getKey() : data.charAt(0);
    }

    public static void main(String[] args) {
        /**
         *
         * Input -> aabhergambara
         * Key -> Characters
         * Value -> Frequency
         */

        String data = "aabhergambara";
//        HashMap<Character, Integer> frequencyMap = new HashMap<>();
//        for (int i=0 ; i<data.length() ; i++) {
//            char ch = data.charAt(i);
//            if (frequencyMap.containsKey(ch)) {
//                Integer frequency = frequencyMap.get(ch);
//                Integer newFrequency = frequency + 1;
//                frequencyMap.put(ch, newFrequency);
//            } else {
//                frequencyMap.put(ch, 1);
//            }
//        }
//
//        char max = data.charAt(0);
//        for (Character a : frequencyMap.keySet()) {
//            if (frequencyMap.get(a) > frequencyMap.get(max))  {
//                max = a;
//            }
//        }
//
//        System.out.println(frequencyMap);
//        System.out.println(max);
        System.out.println(process(data));
    }
}
