package pages;

import org.openqa.selenium.By;

public interface NewToursPageInterface {

	
	
	
	
	//PageLogo
	By Logo_NewTours=By.xpath("//img[@alt='Mercury Tours']"); 
	
	By Home_Username=By.xpath("//input[@name='userName']");
	
	By Home_Password=By.xpath("//input[@name='password']");
	
	By Home_Submit=By.xpath("//input[@name='login']");
	
	By Home_Welcome_Message = By.xpath("//a[contains(text(),'SIGN-OFF')]");
}
