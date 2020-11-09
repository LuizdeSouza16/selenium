package projeto.junit5.runners;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("Suite de testes Facebook e google")
@SelectPackages("projeto.junit5.tests")
public class TestRunner {
	
	
}
