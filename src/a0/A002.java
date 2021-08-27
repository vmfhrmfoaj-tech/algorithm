package a0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class A002 {

    public boolean solution(String[] phone_book) {

        Comparator<String> comparator = (x, y) -> {
            int len = x.length() - y.length();
            if(len < 0) return -1;
            else if(len > 0 ) return 1;
            else return x.compareTo(y);
        };

        String[] sortedArray = Arrays.asList(phone_book).stream()
                                    .sorted(comparator)
                                    .toArray(String[]::new);


        System.out.println( Arrays.asList(sortedArray).stream().collect(Collectors.joining(", ")) );
        
        

        int len = phone_book.length;
        for(int i=0; i<len-1; i++){
            String cur = sortedArray[i];

            for(int j=i+1; j<len; j++){

                System.out.println( cur + ", " + sortedArray[j] + " -> "+ sortedArray[j].indexOf(cur));
                if( sortedArray[j].indexOf(cur) == 0 )
                    return false;
            }
        }
        return true;
    }

}
