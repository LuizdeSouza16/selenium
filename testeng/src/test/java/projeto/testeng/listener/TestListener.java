package projeto.testeng.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Testes iniciado pelo listener");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Teste passou");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Teste falhou");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Teste foi pulado");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Testes terminado pelo listener");
	}
	
}
