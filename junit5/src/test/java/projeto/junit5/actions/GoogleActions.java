package projeto.junit5.actions;

import org.openqa.selenium.WebDriver;

import projeto.junit5.pageobjects.GoogleObjects;

public class GoogleActions {

	static GoogleObjects gooObj;
	
	public GoogleActions(WebDriver driver) {
		gooObj = new GoogleObjects(driver);
	}
	
	public static void makeSearch() {
		gooObj.getInputSearch().sendKeys("Iphone");
		gooObj.getButtonSubmit().click();
	}
}
