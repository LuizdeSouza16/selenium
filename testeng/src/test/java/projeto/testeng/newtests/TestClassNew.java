package projeto.testeng.newtests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClassNew {
	
		@BeforeClass
		public void BeforePackage2() {
			System.out.println("Executando antes dos testes da classe do pacote 2");
		}
		
		@Test(groups = "unitario")
		public void firstTestPackage2() {
			System.out.println("Executando o primeiro teste do pacote 2");
		}
		
		@Test(groups = "integracao")
		public void secondTestPackage2() {
			System.out.println("Executando o segundo teste do pacote 2");
		}
		
		@Test(groups = "integracao")
		public void thirdTestPackage2() {
			System.out.println("Executando o terceiro teste do pacote 2");
		}
		
		@Test(groups = "unitario")
		public void fourthTestPackage2() {
			System.out.println("Executando o quarto teste do pacote 2");
		}
		@AfterClass
		public void afterPackages2() {
			System.out.println("Executando após os testes de classe do pacote 2");
		}
	}

