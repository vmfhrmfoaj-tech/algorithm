package a00001;

import java.util.HashMap;
import java.util.Map;

class A00001 {
    
    public String solution(String[] participant, String[] completion) {
    	
        Map<String, Integer> participantMap = cache(participant);
        Map<String, Integer> completionMap = cache(completion);

		for(String name : participantMap.keySet()) {
			
			int participantCount = participantMap.get(name);
			int completionCount = completionMap.getOrDefault(name, 0);
			if( participantCount != completionCount ) {
				return name;
			}
		}
		
		throw new IllegalArgumentException("제한사항 오류 : completion의 길이는 participant의 길이보다 1 작습니다.");
    }
    
    private static Map<String, Integer> cache(String[] names){
    	
    	Map<String, Integer> _cache = new HashMap<>();
    	for(String name : names ) {
    		_cache.put(name, _cache.getOrDefault(name, 0) + 1);
    	}
    	
    	return _cache;
    }
}