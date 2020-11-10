package projeto.testeng.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass2 {

	@BeforeClass
	public void BeforeClass2() {
		System.out.println("Executando antes dos testes da classe");
	}
	
	@Test(groups = "unitario")
	public void firstTestClass2() {
		System.out.println("Executando o primeiro teste");
	}
	
	@Test(groups = "integracao")
	public void secondTestClass2() {
		System.out.println("Executando o segundo teste");
	}
	
	@Test(groups = "integracao")
	public void thirdTestClass2() {
		System.out.println("Executando o terceiro teste");
	}
	
	@Test(groups = "unitario")
	public void fourthTestClass2() {
		System.out.println("Executando o quarto teste");
	}
	@AfterClass
	public void afterClass2() {
		System.out.println("Executando após os testes de classe");
	}
}
