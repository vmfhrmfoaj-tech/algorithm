package a0;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class A002Test {

    private A002 solution = new A002();
    
    @Test
    public void a002Test_case_01() throws Exception{
        
        String[] phone_book = new String[]{"119", "97674223", "1195524421"};
        boolean expect = false;
        
        boolean actual = solution.solution(phone_book);

        assertThat(actual).isEqualTo(expect);
    }
    
    @Test
    public void a002Test_case_02() throws Exception{
        
        String[] phone_book = new String[]{"123","456","789"};
        boolean expect = true;
        
        boolean actual = solution.solution(phone_book);

        assertThat(actual).isEqualTo(expect);
    }
    
    @Test
    public void a002Test_case_03() throws Exception{
        
        String[] phone_book = new String[]{"12","123","1235","567","88"};
        boolean expect = false;
        
        boolean actual = solution.solution(phone_book);

        assertThat(actual).isEqualTo(expect);
    }
}
