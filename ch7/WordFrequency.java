package ch7;

import java.util.StringTokenizer;
import java.util.HashMap;


public class WordFrequency {
    public static void main (String [] args){
        String sentence = "the quicly brown fox jumps over the lazy dog the fox";

        //StringTokenizer splits on space because its the default delimiter
        StringTokenizer tokenizer = new StringTokenizer(sentence);

        //HashMap stores word -> xount
        //Second parameter has to be an integer
        HashMap<String, Integer> wordCount = new HashMap<>();

        while (tokenizer.hasMoreTokens()){ //keeps looping until all words from the sentence are processed 
            String word = tokenizer.nextToken(); //.nextToken gets the next word in thes tring

            if (wordCount.get(word) == null){ //looks up word in the hasmap, if null is returned, adds with count 1
                wordCount.put(word,1); //java auto puts the one into an INteger object
            } else{
                wordCount.put(word,wordCount.get(word) +1); //word exists so increment count
            }
        }

        System.out.println("Word frequencies:");
        for (String key : wordCount.keySet()){
            System.out.println(key + ": " + wordCount.get(key));
        }
    }
}
