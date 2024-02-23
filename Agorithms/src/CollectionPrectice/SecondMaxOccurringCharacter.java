package CollectionPrectice;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SecondMaxOccurringCharacter {

//	Write java code for the second maximum occurring character from string Test   Case-1: Input: ccccbbaaa Output: a
    public static char findSecondMaxOccurringChar(String input) {
        Map<Character, Long> charCountMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        
        long maxFrequency = charCountMap.values().stream()
                .max(Long::compare)
                .orElse(0L);

        char secondMaxChar = charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() < maxFrequency)
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse('\0');

        return secondMaxChar;
    }

    public static void main(String[] args) {
        String input = "ccccbbaaa";
        char result = findSecondMaxOccurringChar(input);
        System.out.println("Second maximum occurring character: " + result);
    }
    //ouput: =Second maximum occurring character: a
}
