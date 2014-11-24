import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class Ex6Test {

	@Test
	public void ex6_1_1(){
		Ex6 ex6 = new Ex6();
		int [] expected = {5, 4, 3, 2, 1};
		int [] actual = ex6.ex6_1();
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_2_1(){
		Ex6 ex6 = new Ex6();
		double [] expected = {1.1, 2.2, 3.3, 4.4, 5.5};
		double [] actual = ex6.ex6_2();
		assertThat(actual, is(expected));
	}

	// エントリーポイント
	public static void main(String[] args){
		org.junit.runner.JUnitCore.main(Ex6Test.class.getName());
	}
}
