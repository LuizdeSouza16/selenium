package projeto.testeng.testparam;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParamTests {

	@Test(dataProvider = "dataTest")
	public void names(String name, int age) {
		System.out.println(name + " , Age:" + age);
	}
	
	@Ignore
	@Parameters("cor")
	@Test
	public void color(String color) {
		System.out.println(color);
	}
	

	@DataProvider(name = "dataTest")
	public Object[][] data(){
		return new Object[][] {
			{"Erick", new Integer(34)},
			{"Maria", new Integer(54)}
		};
	}
}
