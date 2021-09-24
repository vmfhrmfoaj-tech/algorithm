package a0;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class A007Test {

    private A007 solution = new A007();
    
    @Test
    public void a007Test_case_01() throws Exception{
        
        int bridge_length = 1;
        int weight = 10;
        int[] truck_weights = new int[]{7,4,5,6};

        int expect = 8;
        
        int actual = solution.solution(bridge_length, weight, truck_weights);

        assertThat(actual).isEqualTo(expect);
    }
    
    @Test
    public void a007Test_case_02() throws Exception{
        
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = new int[]{10};

        int expect = 101;
        
        int actual = solution.solution(bridge_length, weight, truck_weights);

        assertThat(actual).isEqualTo(expect);
    }
    
    @Test
    public void a007Test_case_03() throws Exception{
        
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = new int[]{10,10,10,10,10,10,10,10,10,10};

        int expect = 110;
        
        int actual = solution.solution(bridge_length, weight, truck_weights);

        assertThat(actual).isEqualTo(expect);
    }
}
