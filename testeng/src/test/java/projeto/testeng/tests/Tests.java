package projeto.testeng.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests {

	@BeforeTest
	public void beforeTest() {
		System.out.println("Antes de todos os testes");
	}

	@BeforeClass
	public void before() {
		System.out.println("Executado antes dos testes da classe");
	}

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Executado antes de cada metodo");

	}

	@Test(groups = "unitarios")
	public void test() {
		System.out.println("Sou o método de testes do ng");
	}

	@Test(groups = "funcionais")
	public void test2() {
		System.out.println("Sou o segundo teste de testes");
	}

	@Test
	public void test3() {
		System.out.println("Sou o terceiro na suite de testes");
	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("Executado depois de cada metodo");

	}

	@AfterClass
	public void after() {
		System.out.println("Exectado depois da classe");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Depois de todos os testes");
	}

}
