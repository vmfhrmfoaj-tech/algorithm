package a0;

import java.util.HashMap;
import java.util.Map;

public class A003 {

    public int solution(String[][] clothes) {

        Map<String, Integer> _clothes = new HashMap<String, Integer>();
        for(String[] key : clothes){
            int count = _clothes.getOrDefault(key[1], 0) + 1;
            _clothes.put(key[1], count);
        }

        int result = 1;
        for(String key : _clothes.keySet()){
            result *= _clothes.get(key) + 1;
        }

        return result - 1;
    }
}