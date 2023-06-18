package com.learnerhub.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.config.ConfigurationManager;
import com.framework.testng.api.base.ProjectHooks;
import com.framework.utils.FakerDataFactory;
import com.learnerhub.pages.LoginPage;

public class TC003_ForgotPassword extends ProjectHooks{
	@BeforeTest
	public void setValues() {
		testcaseName = "Reset Password";
		testDescription ="Reset password for existing user";
		authors="Babu";
		category ="Smoke";
		browser = "msedge";
	}
	
	@Test
	public void runRegister() {
		
		String username = ConfigurationManager.configuration().appUserName();
		String password = "testleaf";
		
		new LoginPage()
		.clickForgotPassword()
		.enterUserName(username)
		.selectSecurityQn(2)
		.enterAnswer(password)
		.enterNewPwd(password)
		.enterConfirmNewPwd(password)
		.clickReset();
		
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickLogout();
	}

}
