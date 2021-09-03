package a0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A004 {

    public int[] solution(String[] genres, final int[] plays) {
        
        Map<String, Integer> totalplays = new HashMap<>();  // 장르, 총횟수
        Map<String, List<Integer>> cache = new HashMap<>();  // 장르, 목록<인덱스>

        for(int index = 0; index<genres.length; index++){
            int play = totalplays.getOrDefault(genres[index], 0) + plays[index];
            totalplays.put(genres[index], play);

            List<Integer> indexes = cache.getOrDefault(genres[index], new ArrayList<Integer>());
            indexes.add(index);

            cache.put(genres[index], indexes);
        }

        List<Integer> album = new ArrayList<>();
        totalplays.keySet().stream()
            .sorted((x, y) -> (totalplays.get(x) > totalplays.get(y))?-1:1)
            .forEach(x -> {
                System.out.println( x + " - " + totalplays.get(x) );

                List<Integer> list = cache.get(x);
                list.sort(new Comparator<Integer>(){
                    
                    @Override
                    public int compare(Integer i1, Integer i2){
                        if(plays[i1] > plays[i2]) return -1;
                        if(plays[i1] < plays[i2]) return 1;

                        return (i1<i2)?-1: 1;
                    }
                });

                final int lastIndex = (list.size()>2)?2:list.size();
                album.addAll(list.subList(0, lastIndex));

                for(int index: list){
                    System.out.println("    " + index + " : " + plays[index]);
                }
            });

        System.out.println("------------------------------------------");
        for(int index: album){
            System.out.println("    " + index + " : " + plays[index]);
        }

        return album.stream().mapToInt(Integer::intValue).toArray();
    }
}