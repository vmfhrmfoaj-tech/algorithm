package a0;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class A003Test {

    private A003 solution = new A003();
    
    @Test
    public void a003Test_case_01() throws Exception{
        
        String[][] clothes = new String[][]{
            {"yellowhat", "headgear"}, 
            {"bluesunglasses", "eyewear"}, 
            {"green_turban", "headgear"}
        };
        int expect = 5;
        int actual = solution.solution(clothes);

        assertThat(actual).isEqualTo(expect);
    }
    
    @Test
    public void a003Test_case_02() throws Exception{
        
        String[][] clothes = new String[][]{
            {"crowmask", "face"}, 
            {"bluesunglasses", "face"}, 
            {"smoky_makeup", "face"}
        };
        int expect = 3;
        int actual = solution.solution(clothes);

        assertThat(actual).isEqualTo(expect);
    }
}
