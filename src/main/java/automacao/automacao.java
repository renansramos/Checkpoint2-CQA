package automacao;
import org.openqa.selenium.By;

import java.util.List;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class automacao {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
	
	
		WebDriver driver = new ChromeDriver();
	
	 	driver.get("https://wiki.ixcsoft.com.br/index.php/IXCwiki:P%C3%A1gina_de_testes");
        System.out.println("O nome da página acessada é: " + driver.getTitle());
               
        WebElement btn = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/div[3]/table/tbody/tr[1]/td[1]/a[2]"));
        btn.click();
        System.out.println("CLK1 - Entra na pagina de testes 1: " + driver.getTitle());
	        
        WebElement btn2 = driver.findElement(By.xpath("//*[@id=\"contentSub\"]/span/a"));
        btn2.click();
        System.out.println("CLK2 - Volta para pagina de testes: " + driver.getTitle());
        
        WebElement btn3 = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/div[3]/table/tbody/tr[1]/td[2]/a[2]"));
        btn3.click();
        System.out.println("CLK3 - Acessa a página de testes 2: " + driver.getTitle());
        
        WebElement btn4 = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/p/a[1]"));
        btn4.click();
        System.out.println("CLK4 - Acessa a página Principal: " + driver.getTitle());
        
         
	    
	        
 

    }
}