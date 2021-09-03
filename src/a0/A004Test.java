package a0;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class A004Test {

    private A004 solution = new A004();
    
    @Test
    public void a004Test_case_01() throws Exception{
        
        String[] genres = new String[]{
            "classic", "pop", "classic", "classic", "pop"
        };
        
        int[] plays = new int[]{
            500, 600, 150, 800, 2500
        };
        int[] expect = new int[]{4, 1, 3, 0};
        int[] actual = solution.solution(genres, plays);

        assertThat(actual).isEqualTo(expect);
    }
    
    @Test
    public void a004Test_case_02() throws Exception{
        
        String[] genres = new String[]{
            "A", "A", "B", "A", "B", "B", "A", "A", "A", "A"
        };
        
        int[] plays = new int[]{
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1
        };
        int[] expect = new int[]{0, 1, 2, 4};
        int[] actual = solution.solution(genres, plays);
        
        assertThat(actual).isEqualTo(expect);
    }
    
    @Test
    public void a004Test_case_03() throws Exception{
        
        String[] genres = new String[]{"classic", "pop", "classic", "classic","jazz","pop", "Rock", "jazz"};
        int[] plays = new int[]{500, 600, 150, 800, 1100, 2500, 100, 1000};
        int[] expect = new int[]{5, 1, 4, 7, 3, 0, 6};
        int[] actual = solution.solution(genres, plays);

        assertThat(actual).isEqualTo(expect);
    }
}
