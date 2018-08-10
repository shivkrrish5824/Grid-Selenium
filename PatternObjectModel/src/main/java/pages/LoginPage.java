package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods{


	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="username")
	private WebElement eleUserName;
	//@And("enter Username as (.*)")
	//@Given("Enter Username as (.*)")
	@Given("Enter the Username as (.*)")
	public LoginPage typeUserName(String data) {
		// eleUName = locateElement("username");
		type(eleUserName, data);		
		return this;
	}

	
	@FindBy(how=How.ID,using="password")
	private WebElement elePassword;
	//@And("enter Password as (.*)")
	//@Given("Enter Password as (.*)")
	@Given("Enter the Password as (.*)")
	public LoginPage typePassword(String data) {
		type(elePassword, data);
		return this;
	}


	@FindBy(how=How.CLASS_NAME,using = "decorativeSubmit")
	private WebElement eleLogin;
	//@When("Click Login button")
	//@When("click Login button")
	@When("click login button")
	public HomePage clickLogin() {
		click(eleLogin);	
		return new HomePage();
	}
	
	@But("Verify the Error")
	public LoginPage verifyLogin() {
		verifyEnabled(eleLogin);	
		return this;
	}
	
	
	
	
	
	
	
	
	
	




}
