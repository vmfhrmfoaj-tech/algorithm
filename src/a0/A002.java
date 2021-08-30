package a0;

import java.util.Arrays;
import java.util.Comparator;

public class A002 {

    public boolean solution(String[] phone_book) {

        // Arrays.sort(phone_book, new Comparator<String>(){

        //     @Override
        //     public int compare(String x, String y) {
        //             int len = x.length() - y.length();
        //             if(len < 0) return -1;
        //             else if(len > 0 ) return 1;
        //             else return x.compareTo(y);
        //     }
        // });

        Arrays.sort(phone_book);

        System.out.println();
        Arrays.asList(phone_book).stream().forEach(System.out::println);
        

        int len = phone_book.length;
        for(int i=0; i<len-1; i++){
            if( phone_book[i + 1].indexOf(phone_book[i]) == 0 ){
                return false;
            }
        }
        return true;
    }

}
