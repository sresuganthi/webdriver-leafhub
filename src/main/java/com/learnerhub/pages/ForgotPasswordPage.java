package com.learnerhub.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectHooks;

public class ForgotPasswordPage extends ProjectHooks{
	
	public ForgotPasswordPage enterUserName(String userName) {
		clearAndType(locateElement(Locators.ID, "userName"), userName);
		reportStep("Username entered successfully","pass");
		return this;
	}
	
	
	public ForgotPasswordPage selectSecurityQn(int option) {
		selectDropDownUsingIndex(locateElement(Locators.ID, "secQuest"), option);
		reportStep("Security question is selected successfully","pass");
		return this;
	}
	
	public ForgotPasswordPage enterAnswer(String answer) {
		clearAndType(locateElement(Locators.ID, "answer"), answer);
		reportStep("Security Answer entered successfully","pass");
		return this;
	}
	
	public ForgotPasswordPage enterNewPwd(String newPwd) {
		clearAndType(locateElement(Locators.ID, "newPassword"), newPwd);
		reportStep("New Password entered successfully","pass");
		return this;
	}
	
	public ForgotPasswordPage enterConfirmNewPwd(String newPwd) {
		clearAndType(locateElement(Locators.ID, "confirmPassword"), newPwd);
		reportStep("Confirm Password entered successfully","pass");
		return this;
	}
	
	public LoginPage clickReset() {
		click(locateElement(Locators.XPATH, "//input[@type='submit']"));
		reportStep("Reset button clicked successfully", "pass");
		return new LoginPage();
	}
	
	
	
}
