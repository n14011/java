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
	@Test
	public void ex6_3_1(){
		Ex6 ex6 = new Ex6();
		int [] expected = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int [] actual = ex6.ex6_3(10, 0);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_3_2(){
		Ex6 ex6 = new Ex6();
		int [] expected = {1000};
		int [] actual = ex6.ex6_3(1, 1000);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_3_3(){
		Ex6 ex6 = new Ex6();
		int [] expected = {1, 1, 1};
		int [] actual = ex6.ex6_3(3, 1);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_3_4(){
		Ex6 ex6 = new Ex6();
		int [] expected = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		int [] actual = ex6.ex6_3(10, -1);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_3_5(){
		Ex6 ex6 = new Ex6();
		int [] expected = {2, 2};
		int [] actual = ex6.ex6_3(2, 2);
		assertThat(actual, is(expected));
	}

	// エントリーポイント
	public static void main(String[] args){
		org.junit.runner.JUnitCore.main(Ex6Test.class.getName());
	}
}
