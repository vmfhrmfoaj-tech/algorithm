package a0;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class A005Test {

    private A005 solution = new A005();
    
    @Test
    public void a005Test_case_01() throws Exception{
        
        int[] progresses = new int[]{93, 30, 55};
        int[] speeds = new int[]{1, 30, 5};
        int[] expect = new int[]{2, 1};
        int[] actual = solution.solution(progresses, speeds);

        assertThat(actual).isEqualTo(expect);
    }
    
    @Test
    public void a005Test_case_02() throws Exception{
        
        int[] progresses = new int[]{95, 90, 99, 99, 80, 99};
        int[] speeds = new int[]{1, 1, 1, 1, 1, 1};
        int[] expect = new int[]{1, 3, 2};
        int[] actual = solution.solution(progresses, speeds);

        assertThat(actual).isEqualTo(expect);
    }
}
