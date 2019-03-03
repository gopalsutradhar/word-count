import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.*;
public class count
{
            static void duplicate(String inputString){

            HashMap<String, Integer> wordCount = new HashMap<String,Integer>();
            String[] words = inputString.split(" ");

            for(String word : words){
                if(wordCount.containsKey(word)){
                    wordCount.put(word, wordCount.get(word)+1);
                }
                else{
                    wordCount.put(word, 1);
                }
            }
            //Extracting of all keys of word count
            Set<String> wordsInString = wordCount.keySet();

            for(String word : wordsInString){
                if(wordCount.get(word)>0){
                    System.out.println(word+":"+wordCount.get(word));
                }
            }

        }
    public static void main(String[] args) throws IOException
    {
        File file = new File("C:/Users/Gopal/Downloads/Documents/sampletext.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            duplicate(st);
    }


}

