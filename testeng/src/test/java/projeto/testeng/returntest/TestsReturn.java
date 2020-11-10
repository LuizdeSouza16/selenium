package projeto.testeng.returntest;

import org.testng.annotations.Test;

public class TestsReturn {
	
	@Test(groups = {"retorno", "unitario"})
	public String grettings() {
		System.out.println("Bom dia");
		return "Bom dia!!";
	}
	
	@Test(groups = {"retorno", "integracao"})
	public boolean trueOrFalse() {
		System.out.println("Verdadeiro");
		return true;
	}
	@Test(groups = {"void", "unitario"})
	public void test3ClassReturn() {
		System.out.println("Teste void da classe de retorno");
		System.out.println(grettings());
	}
	
	@Test(groups = {"void", "integracao"})
	public void test4ClassReturn() {
		System.out.println("Teste void 2 da classe de retorno");
		System.out.println(trueOrFalse());
	}
	
}
