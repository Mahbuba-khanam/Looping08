package testcases;

import java.nio.file.Paths;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.SelectOption;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class WebTableHandling {

	private static LocalDateTime localDateTime;

	public static void main(String[] args) throws InterruptedException {
		String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		Playwright playwright;
		playwright = Playwright.create();

		Browser browser;
		browser = playwright.chromium()
				.launch(new BrowserType.LaunchOptions().setHeadless(false).setExecutablePath(Paths.get(chromePath)));

		Page page;
		page = browser.newPage();

		page.navigate("C:\\java\\html-file(new)\\html-all.html");

		// File Upload
		page.locator("//input[@id='input__file']").setInputFiles(Paths.get("C:\\java\\html-form-page.html"));

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
		// Find element for Select menus
		SelectOption sp;
		sp = new SelectOption();

		page.selectOption("select", sp.setIndex(2));
		Thread.sleep(2000);

		page.locator("//input[@id='input__file']").setInputFiles(Paths.get("./src/test/resources/files/lotus.jpg"));
		// find element for check box or toggle
//		page.locator("//label[@for='checkbox1']").click();
//		page.locator("//label[@for='checkbox2']").click();
//		page.locator("//label[@for='checkbox3']").click();
		Locator checkbox = page.locator("[type='checkbox']");
		for (int i = 1; i < checkbox.count(); i++) {
			checkbox.nth(i).click();
		}

		// Select Animal
		page.selectOption("#select_city", "Dhaka");
		page.selectOption("#select_animal", "Cow");

		// Select multiple

		String[] multiSelectionValues = { "Option One", "Option Three" };
		page.selectOption("//select[@id='select multiple']", multiSelectionValues);

		// page.locator("//textarea[@id='textarea']").fill("Hi,this is Neepa.");
		Thread.sleep(3000);
		page.locator("#textarea").fill("Hi, this is Neepa from AZ");

		// Verify color input
		String color = "#000000";
		page.fill("#ic", color);
		String actualcolor = page.locator("#ic").getAttribute("value");
		if ("#00000".equals(actualcolor)) {
			System.out.println("Test case pass");
		} else {
			System.out.println("test case fail");
		}

		Thread.sleep(3000);
		// page.locator("#in").fill("3");
		for (int i = 0; i < 3; i++) {
			page.press("#in", "ArrowUp");
			// page.press("#in", "ArrowDown");
		}

//		String expetColor = page.locator("#ic").getAttribute("value");
//		if ("#000000".equals(expetColor)) {
//			System.out.println("Color test case pass");
//		} else {
//			System.out.println("Color test case fail");
//		}
		// Number input
//		for (int i = 0; i < 3; i++) {
//			page.press("#in", "ArrowDown");
//			// page.press("#in","ArrowUp");

		// }
		// Range input
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// page..locator("//input[@id='ir'").click();
		Locator slider = page.locator("//input[@id='ir']");
		Thread.sleep(2000);
		page.mouse().move(slider.boundingBox().x + slider.boundingBox().width / 2,
				slider.boundingBox().y + slider.boundingBox().height / 2);
		page.mouse().down();

		// page.mouse().up();

//		Locator slider = page.locator("//*[@id='ir']");
//		Thread.sleep(2000);
//		page.mouse().move(slider.boundingBox().x + slider.boundingBox().width / 2,
//				slider.boundingBox().y + slider.boundingBox().height / 2);
//		page.mouse().down();
//		page.mouse().move(slider.boundingBox().x + 600, slider.boundingBox().y + slider.boundingBox().height / 2);
//		page.mouse().up();

		// Date input
		page.locator("#idd").fill("2023-10-23");
		page.locator("#idm").fill("2023_11");
		page.locator("idw").fill("2023-W03");
		page.locator("#idt").fill("2023-11-16T10:15:00");
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
		String dateTimeValues = localDateTime.format(dateTimeFormatter);
		page.fill("#idtl", dateTimeValues);
	page.locator("#idl").fill("Example #2");
		// ----------------------------------------
		Thread.sleep(3000);

		// page.locator(".dataTable>tbody").locator("tr:first-child").count());
		System.out.println("First child Row: " + page.locator(".dataTable>tbody>tr:first-child").count());
		// First child Column count
		// System.out.println("First child column: "
		// Web table handling id=#,class=.
		// Total Row Count
		int row = page.locator(".dataTable>tbody").locator("tr").count();
		System.out.println("Total Row: " + row);
		// System.out.println("Total Row: " +
		// page.locator(".dataTable>tbody").locator("tr").count());
		// System.out.println("Total Row: " +
		// page.locator(".dataTable>tbody>tr").count());

		// Total Column Count
		int column = page.locator(".dataTable>tbody>tr>td").count();
		System.out.println("Total Column: " + column);
		System.out.println("Total Column count: " + page.locator(".dataTable>tbody>tr>td").count());

		// First child Row count
		// System.out.println("First child Row: " +
		// +
		// page.locator(".dataTable>tbody").locator("tr:first-child").locator("td").count());
		System.out.println("Third child column: " + page.locator(".dataTable>tbody>tr:nth-child(3)>td").count());
		// Second child Column count
		System.out.println("Second child column: "
				+ page.locator(".dataTable>tbody").locator("tr:nth-child(2)").locator("td").count());

		// Verify Column Text
		// assertThat(page.locator(".dataTable>tbody").locator("tr:first-child").locator("td:nth-child(2)"))
		// .hasText("Table cell 2");
		assertThat(page.locator(".dataTable>tbody").locator("tr:first-child").locator("td:nth-child(2)"))
				.hasText("Table Cell 2");

		// Total table text print //java lamda expression
		
		page.locator(".dataTable>tbody").allInnerTexts().forEach(text -> System.out.println(text));

		System.out.println("((((((((_(((((((((()))");

	}

}
