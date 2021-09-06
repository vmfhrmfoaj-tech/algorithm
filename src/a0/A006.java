package a0;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class A006 {

    class Item{

        final int value;
        final boolean target;

        public Item(int value, boolean target) {
            this.value = value;
            this.target = target;
        }
    }

    private boolean isGreatFirstValue(Item base, List<Item> list){
        for(Item cur : list){
            if( base.value < cur.value){
                return false;
            }
        }

        return true;
    }

    public int solution(int[] priorities, int location) {

        List<Item> items = IntStream.range(0, priorities.length)
            .mapToObj(i->new Item(priorities[i], (i==location)))
            .collect(Collectors.toList());

        int printed = 0;

        System.out.println("(" + printed + ") S : " + items.stream().map(x->String.valueOf(x.value + (x.target?"T":""))).collect(Collectors.joining(", ")) );

        for(;0!=items.size(); ){

            Item cur = items.remove(0);

            if( isGreatFirstValue(cur, items) ){
                printed++;
                System.out.println("(" + printed + ") Printed. => " + cur.value);
                if( cur.target == true ){
                    System.out.println("(" + printed + ") Finish.");
                    break;
                }
            }else{
                items.add(cur);
                System.out.println("(" + printed + ") N : " + items.stream().map(x->String.valueOf(x.value + (x.target?"T":""))).collect(Collectors.joining(", ")) );
            }
        }

        System.out.println();
        
        return printed;
    }
}