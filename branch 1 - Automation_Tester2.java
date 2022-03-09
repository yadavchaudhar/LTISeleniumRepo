package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCommands {

	public static void main(String[] args, String title) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kchau\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/"); 
		System.out.println("title is :"+title); 
		//check title of web page s equals to Demo Web Shop
		if(title.equals("Demo Web Shop")) { 
			System.out.println("title is corect");
			}
		//fetch current url
		System.out.println(driver.getCurrentUrl());
		//fetch html source of page 
		System.out.println(driver.getPageSource());
		//move back
		driver.navigate().back();
		//move forward
		driver.navigate().forward(); 
		//refresh
		driver.navigate().refresh();
		driver.close();

	}

}
