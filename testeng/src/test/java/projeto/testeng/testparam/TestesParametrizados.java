package projeto.testeng.testparam;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestesParametrizados {

	@Parameters({"nome", "sobrenome"})
	@Test
	public void nome(String nome, String sobrenome) {
		System.out.println(nome + " " + sobrenome);
	}
	
	@Parameters("cor")
	@Test
	public void cores(String cor) {
		System.out.println(cor);
	}
}
