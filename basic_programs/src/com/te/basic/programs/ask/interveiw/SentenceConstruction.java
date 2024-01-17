package com.te.basic.programs.ask.interveiw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SentenceConstruction {

    public static List<String> wordBreak(String sentence, List<String> wordDict) {
        return wordBreakHelper(sentence, new ArrayList<>(), wordDict, 0);
    }

    private static List<String> wordBreakHelper(String sentence, List<String> current, List<String> wordDict, int start) {
    	System.err.println(start+  "  ]]]]]]]]]]]]]]");
        List<String> result = new ArrayList<>();

        if (start == sentence.length()) {
//        	System.err.println(sentence.length());
            // Reached the end of the sentence, construct the final sentence.
            result.add(String.join(" ", current));
            /*
             * join method in java
             * For example, 
                      String message = String.join("-", "Java", "is", "cool");
                     // message returned is: "Java-is-cool"
               Note that if an element is null, then "null" is added.
               Parameters:
               delimiter the delimiter that separates each element
               elements the elements to join together.
               Returns:a new String that is composed of the elements separated by the delimiter
             * 
             * 
             */
            return result;
        }

        for (int end = start + 1; end <= sentence.length(); end++) {
            String word = sentence.substring(start, end);
            /*
             * Returns a string that is a substring of this string. 
         * The substring begins at the specified beginIndex and extends to the character at index endIndex - 1.
         * Thus the length of the substring is endIndex-beginIndex. 
                Examples: 
                "hamburger".substring(4, 8) returns "urge"
               "smiles".substring(1, 5) returns "mile"
              */
            System.err.println(">>>" + word);
          
            if (wordDict.contains(word)) {
                // If the current word exists in the dictionary, add it to the current list.
                current.add(word);
                // Recursively find sentences for the remaining part of the sentence.
                List<String> subSentences = wordBreakHelper(sentence, current, wordDict, end); 
                System.err.println(end);
                result.addAll(subSentences);
                // Backtrack to explore other possibilities.
                current.remove(current.size() - 1);
                System.err.println(current+"  ..............................................................");
            }
        }

        return result;
    }

    public static void main(String[] args) {
//        String sentence = "sandcatdog";
    	String sentence = "Iam";
//        List<String> wordDict = Arrays.asList("kitten","cat", "cats", "and", "sand", "dog","frog","high");
        List<String> wordDict = Arrays.asList("Ia","m","am","I");

        List<String> sentences = wordBreak(sentence, wordDict);

        for (String s : sentences) {
            System.out.println(s);
        }
    }
}
