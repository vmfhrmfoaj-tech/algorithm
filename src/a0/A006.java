package a0;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class A006 {

    public int solution(int[] priorities, int location) {

        Queue<Document> queue = IntStream.range(0, priorities.length)
                .mapToObj(i->new Document(i, priorities[i]))
                .collect(Collectors.toCollection(LinkedList::new));


        int printed = 0;
            
        System.out.println();
        System.out.println("(" + printed + ") S : " + queue.stream().map(x->String.valueOf(x.priority + (location==x.id?"T":""))).collect(Collectors.joining(", ")) );

        while(!queue.isEmpty()){

            Document doc = queue.poll();

            if( !queue.stream().anyMatch(x -> x.priority > doc.priority ) ){
                printed++;
                System.out.println("(" + printed + ") Printed. => " + doc.priority);
                if(doc.id == location){
                    System.out.println("(" + printed + ") Finish.");
                    break;
                }
            }else{
                queue.add(doc);
                System.out.println("(" + printed + ") N : " + queue.stream().map(x->String.valueOf(x.priority + (location==x.id?"T":""))).collect(Collectors.joining(", ")) );
            }
        }
        
        return printed;
    }

    class Document {
        final int id;
        final int priority;
        public Document(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }
}
