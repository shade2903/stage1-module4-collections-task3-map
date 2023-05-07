package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String[] words = sentence.replaceAll("\\p{P}", "").split(" ");
        Map<String, Integer> map = new HashMap<>();
        int count = 1;
        for(String str : words){
            str = str.toLowerCase();
            if(map.containsKey(str)){
             int repeat =map.get(str);
                map.put(str,++repeat );
            }else if (str!=null && !str.equals("")){
                map.put(str,count);
            }
        }
        return map;
    }
}
