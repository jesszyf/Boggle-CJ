package com.example.demouser.boggle_cj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Crystal on 1/13/17.
 */

public class BoogleDictionary {

    private ArrayList<String> dictionary = new ArrayList<String>();
    public ArrayList<String> typedList;
    public Map<String, Boolean> wordMap = new HashMap<String, Boolean>();


    public BoogleDictionary(InputStream wordListStream, MainActivity main) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(wordListStream));
        String line;

        while((line = in.readLine()) != null) {
            String word = line.trim();

            //  Your code here
            //new array list for the whole list of strings
            //from the hardware to the memory
            dictionary.add(word);
        }

        typedList = main.getWordList();

        for (String obj: typedList) {
            //Add boolean values to HashMap: checkWord(obj);
            wordMap.put(obj, checkWord(obj));
        }
    }


    private boolean checkWord(String obj){

        if(dictionary.contains(obj))
            return true;

        else
            return false;
    }

    public Map<String, Boolean> getMap(){

        return wordMap;
    }



}
