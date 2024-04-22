package testcases;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class Class_23_Extention {

	public static void main(String[] args) {
		String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";

		// playwright declaration and creation
		Playwright playwright;
		playwright = Playwright.create();

		LaunchOptions launchOptions;
		launchOptions = new BrowserType.LaunchOptions().setHeadless(false).setExecutablePath(Paths.get(chromePath));

		Browser browser;
		browser = playwright.chromium().launch(launchOptions);

		Page page;
		page = browser.newPage();

		page.navigate("C:\\java\\html-file(new)\\html-all.html");

		page.locator("#input__text").fill("'Hello World'");

		page.locator("#input__password").fill("123456");
		page.locator("#input__webaddress").fill("https://yoursite.com");
	 
		page.locator("#input__emailaddress").fill("Neepa@gmail.com");
		//page.locator("#input_phone").fill("(480)704-425");
		page.locator("#input__phone").fill("(347) 222-333");
		page.locator("input_search").fill("Batch23");
		page.locator("input_text2").fill("7");
		page.locator("#input__file").setInputFiles(Paths.get("C:\\java\\html-form-page.html"));
		page.selectOption("#select-city","Dhaka");
		page.selectOption("#select_animal","Cat");
		String selectSelector = "select_multiple";
		
		
		

	}

}
