package CalculatorTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calculator_Automation {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
	//Addition	
		WebElement inp1 = driver.findElement(By.xpath("//span[normalize-space()='7']"));
		inp1.click();
		//System.out.print("7");
		WebElement plus = driver.findElement(By.xpath("//span[normalize-space()='+']"));
		plus.click();
		//System.out.print("+");
		WebElement inp2 = driver.findElement(By.xpath("//span[normalize-space()='2']"));
		inp2.click();
		//System.out.print("2");
		//System.out.print("=");
		//System.out.print("9");
		Thread.sleep(4000);
		//All Clear
		WebElement allClear = driver.findElement(By.xpath("//span[normalize-space()='AC']"));
		allClear.click();
		
		//Subtraction
		WebElement inp3 = driver.findElement(By.xpath("//span[normalize-space()='5']"));
		 inp3.click();
		 WebElement minus = driver.findElement(By.xpath("//span[contains(text(),'–')]"));
		 minus.click();
		 WebElement inp4 = driver.findElement(By.xpath("//span[normalize-space()='3']"));
		 inp4.click();
		  Thread.sleep(6000);
		  
		//All Clear
			WebElement allClear1 = driver.findElement(By.xpath("//span[normalize-space()='AC']"));
			allClear1.click();
			
		 //Multiplication
			
			 WebElement inp5 =  driver.findElement(By.xpath("//span[normalize-space()='9']"));
			 inp5.click();
			 WebElement mult = driver.findElement(By.xpath("//span[normalize-space()='×']"));
			 mult.click();
			 WebElement inp6 = driver.findElement(By.xpath("//span[normalize-space()='2']"));
			 inp6.click();
			 Thread.sleep(6000);
			//All Clear
				WebElement allClear2 = driver.findElement(By.xpath("//span[normalize-space()='AC']"));
				allClear2.click();
		
		  //Division
 				WebElement inp7 = driver.findElement(By.xpath("//span[normalize-space()='8']"));
				 inp7.click();	
				 WebElement divide = driver.findElement(By.xpath("//span[@onclick=\"r('/')\"]"));
				 divide.click();	
				 WebElement inp8 = driver.findElement(By.xpath("//span[normalize-space()='4']"));
				 inp8.click();
				 Thread.sleep(7000);
				 
				//All Clear
					WebElement allClear3 = driver.findElement(By.xpath("//span[normalize-space()='AC']"));
					allClear3.click();

	}
}
