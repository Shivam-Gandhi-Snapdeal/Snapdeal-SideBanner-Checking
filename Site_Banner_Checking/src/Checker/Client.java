package Checker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.snapdeal.com/");

		String[] arr = new String[7];
		int j;
		
		for(int i=0;i<7;i++) {
			j = i+2;
			arr[i] = driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[" + j + "]/a")).getAttribute("href");
		}
		
		for(String link:arr) {

			System.out.println(link);
		}
		
		

	}

}
