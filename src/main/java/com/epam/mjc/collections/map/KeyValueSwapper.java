package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map  = new HashMap<>();
        for(Map.Entry<Integer, String> e : sourceMap.entrySet()){
            if(e.getValue().equals(map.get(e.getKey()))){
                if(e.getKey() < map.get(e.getValue())){
                    map.put(e.getValue(),e.getKey());
                }
            }else{
                map.put(e.getValue(), e.getKey());
            }
        }
        return map;
    }
}
