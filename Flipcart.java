package com.flipcart.javasuite;

import org.testng.annotations.Test;

import com.flipcart.FlipTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class Flipcart extends WebDriverTestCase {

	@Test(groups = { "SMOKE" }, description = "")
	public void scenario1() {
		FlipTestPage flip=new FlipTestPage();
		flip.launchPage(null);
		flip.getDetails();
		
		
	}

}
