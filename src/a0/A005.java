package a0;

import java.util.ArrayList;
import java.util.List;

public class A005 {

    public int[] solution(int[] progresses, int[] speeds) {

        int len = progresses.length;

        int[] done = new int[len];
        for(int i=0; i<len; i++){
            done[i] = deployDay(progresses[i], speeds[i]);
            // System.out.println( progresses[i] + " + (" + speeds[i] + " * " + done[i] + ") => " + (progresses[i] + ( speeds[i] * done[i])));
        }

        List<Integer> deploy = new ArrayList<>();
        for(int cur=0; cur<len; cur++){
            int day = done[cur];
            int cnt = 1;
            for( int j=cur+1; j<len; j++){
                if( day < done[j]){
                    break;
                }
                cnt++;
                cur++;
            }
            // System.out.println( day + " : " + cnt);
            deploy.add(cnt);
        }

        return deploy.stream().mapToInt(Integer::intValue).toArray();
    }

    int deployDay(int progress, int speed){
        int day = 1;
        while((progress + (speed * day) < 100)){
            day++;
        }

        return day;
    }
}