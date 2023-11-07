package navegacion_Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import clases_Comunes.Clase_Base;

public class Store_Page {
	
	public Store_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this); // inicializamos los pageobject / elementos con page factorey
	}
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement agregar_carrito;
	//hamburguesa
	@FindBy(id="react-burger-menu-btn")
	private WebElement btnHamburguesa;
	//Boton Login
	@FindBy(id="logout_sidebar_link")
	private WebElement btnLogout;
	
	public void logout() 
	{
		Clase_Base.click(agregar_carrito);
		Clase_Base.click(btnHamburguesa);
		Clase_Base.click(btnLogout);
	}

}
