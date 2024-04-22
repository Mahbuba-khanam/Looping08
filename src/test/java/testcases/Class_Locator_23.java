package testcases;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.SelectOption;

public class Class_Locator_23 {

	public static void main(String[] args) throws InterruptedException {

		String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		Playwright playwright;
		playwright = Playwright.create();
		
	//	ArrayList<String>argument= new ArrayList<>();
	//	argument.add("--start-maximized");
		 
		//BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(width,height));

		Browser browser;
		browser = playwright.chromium()
				.launch(new BrowserType.LaunchOptions().setHeadless(false).setExecutablePath(Paths.get(chromePath)));
	//	BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(width,height));
      //  BrowserContext context
		Page page;
		page = browser.newPage();
		//Total Row Count
		//System.out.println(page.locator(chromePath));

		page.navigate("C:\\java\\html-all.html");
		System.out.println(page.title());
		Thread.sleep(2000);
		page.locator("#input__text").fill("MicroTech");
		page.locator("#input__password").fill("1234");
		page.locator("//input[@placeholder='name@email.com']").fill("mahbuba.khan@gmail.com");
		page.locator("//input[@id='input__webaddress']").fill("https://yoursite.com");
		page.locator("//input[@id='input__phone']").fill("(999)999-9999");
		page.locator("//input[@id='input__search']").fill("SkyItSchool");
		page.locator("//input[@id='input__text2']").fill("8");
		Thread.sleep(2000);
		
		
//		// Find element for Select menus
//		pa
//		SelectOption sp;
//		sp = new SelectOption();
//
//		page.selectOption("select", sp.setIndex(2));
//		hread.sleep(2000);

		page.locator("//input[@id='input__file']").setInputFiles(Paths.get("./src/test/resources/files/lotus.jpg"));
		// find element for check box or toggle
//		page.locator("//label[@for='checkbox1']").click();
//		page.locator("//label[@for='checkbox2']").click();
//		page.locator("//label[@for='checkbox3']").click();
		Locator checkbox = page.locator("[type='checkbox']");
		for (int i = 1; i < checkbox.count(); i++) {
			checkbox.nth(i).click();
		}

		page.locator("//textarea[@id='textarea']").fill("Hi,this is Neepa.");
		Thread.sleep(3000);
		
		// Verify color input
		String expetColor = page.locator("#ic").getAttribute("value");
		if ("#000000".equals(expetColor)) {
			System.out.println("Color test case pass");
		} else {
			System.out.println("Color test case fail");
		}
		// Number input
		for (int i = 0; i < 3; i++) {
			page.press("#in", "ArrowDown");
			// page.press("#in","ArrowUp");

		}
		// Range input
		Locator slider = page.locator("//*[@id='ir']");
		Thread.sleep(2000);
		page.mouse().move(slider.boundingBox().x + slider.boundingBox().width / 2,
				slider.boundingBox().y + slider.boundingBox().height / 2);
		page.mouse().down();
		page.mouse().move(slider.boundingBox().x + 600, slider.boundingBox().y + slider.boundingBox().height / 2);
		page.mouse().up();
		
		
		
		
		

	}

}
