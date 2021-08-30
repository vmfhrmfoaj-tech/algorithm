package a0;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class A003Test {

    private A003 solution = new A003();
    
    @Test
    public void a003Test_case_01() throws Exception{
        
        // String[] phone_book = new String[]{"119", "97674223", "1195524421"};
        boolean expect = false;
        
        // boolean actual = solution.solution(phone_book);
        boolean actual = true;

        assertThat(actual).isEqualTo(expect);
    }
}
