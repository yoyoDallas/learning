package collectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class MainMapTest {
    public static void main(String  [] args){
        String word = "This is a great thing";
        Map<Character,Integer> occurances = new HashMap<>();
        char [] chars = word.toCharArray();
        for(char character : chars){
            Integer interger = occurances.get(character);
            if(interger == null){
                occurances.put(character,1);
            } else {
                occurances.put(character,interger+1);
            }
        }
        System.out.println(occurances);

        String wordCounter = "This  this is the best place to learn the java programing.This a place to to vist.";
        Map<String, Integer> wordOccurance = new HashMap<>();
        String [] words = wordCounter.split("[\\s.]+");
        System.out.println("Total wordls presnt in the sentence is : " + words.length);

        for(String wordmap: words){
            //inorder to get the words in the sentences

            Integer integer = wordOccurance.get(wordmap);
            if(integer == null){
                wordOccurance.put(wordmap,1);
            } else {
                wordOccurance.put(wordmap, integer + 1);
            }
        }
        System.out.println(wordOccurance);

    }

}
