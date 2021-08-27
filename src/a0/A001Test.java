package a0;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class A001Test {

    private A001 solution = new A001();
    
    @Test
    public void a001Test_case_01() throws Exception{
        
        String[] participant = new String[]{"leo", "kiki", "eden"};
        String[] completion = new String[]{"eden", "kiki"};
        String expect = "leo";
        
        String actual = solution.solution(participant, completion);

        assertThat(actual).isEqualTo(expect);
    }

    @Test
    public void a001Test_case_02() throws Exception{
        
        String[] participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = new String[]{"josipa", "filipa", "marina", "nikola"};
        String expect = "vinko";
        
        String actual = solution.solution(participant, completion);

        assertThat(actual).isEqualTo(expect);
    }

    @Test
    public void a001Test_case_03() throws Exception{
        
        String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[]{"stanko", "ana", "mislav"};
        String expect = "mislav";
        
        String actual = solution.solution(participant, completion);

        assertThat(actual).isEqualTo(expect);
    }
}
