package login_Suite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import clases_Comunes.SetupDriver;
import clases_Comunes.Variables_Globales;
import navegacion_Paginas.Login_Page;
import navegacion_Paginas.Store_Page;

public class TC02_Logout {
	//Declaramos el WebDriver
	
	WebDriver driver=SetupDriver.setupDriver(); // inicializamos el driver
	
	//Creamos un objeto de login page
	
	Login_Page login = new Login_Page(driver); //usamos los objetos de la pagina de login
	Store_Page store = new Store_Page(driver);
	
	@BeforeTest
	public void iniciarWebDriver() 
	{
		//obtenemos la url
		driver.get(Variables_Globales.HOME_PAGE);
		driver.manage().window().maximize();
	}
	
  @Test
  public void TC_02()
  {
	login.login(Variables_Globales.USER_ADMIN, Variables_Globales.PASSWORD_ADMIN); 
	
	store.logout();
	  
  }
  //Cerramos el navegador 
  @AfterTest
  public void closeDriver() 
  {
	  driver.quit();
  }
}
