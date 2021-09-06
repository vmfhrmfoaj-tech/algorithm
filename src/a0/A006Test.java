package a0;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class A006Test {

    private A006 solution = new A006();
    
    @Test
    public void a006Test_case_01() throws Exception{
        
        int[] priorities = new int[]{2, 1, 3, 2};
        int location = 2;
        int expect = 1;
        int actual = solution.solution(priorities, location);

        assertThat(actual).isEqualTo(expect);
    }
    
    @Test
    public void a006Test_case_02() throws Exception{
        
        int[] priorities = new int[]{1, 1, 9, 1, 1, 1};
        int location = 0;
        int expect = 5;
        int actual = solution.solution(priorities, location);

        assertThat(actual).isEqualTo(expect);
    }
}
