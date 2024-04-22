package testcases;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Class_23_DataTable {

	public static void main(String[] args) throws InterruptedException {
		Playwright playwright;
		playwright = Playwright.create();
		Browser browser;
		browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page;
		page = browser.newPage();

		page.navigate("C:\\java\\html-file(new)\\html-all.html");
		// --------------------------Field Part
		page.locator("#input__text").fill("MicroTech");
		page.locator("#input__password").fill("12345");
		page.locator("#input__webaddress").fill("amazon.com");
		page.locator("#input__emailaddress").fill("Neepa@gmail.com");
		page.locator("#input__phone").fill("4807044356");
		page.locator("#input__search").fill("SkyItSchool");
		for (int i = 0; i < 3; i++) {
			page.press("#input__text2", "ArrowUp");
		}
		page.locator("#input__file")
				.setInputFiles(Paths.get("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"));
		// ----------------------------------Selection Part
		page.selectOption("#select_city", "Dhaka");
		page.selectOption("#select_animal", "Cat");
		String selectSelector = "#select_multiple";
		String[] values = { "Option One", "Option Three", };
		page.selectOption(selectSelector, values);
//---------------------------------checkbox
//	Locator block=page.locator("//*[@id='forms_checkbox']");
		Locator checkboxes = page.locator("[type='checkbox']");

		for (int i = 1; i < checkboxes.count(); i++) {
			checkboxes.nth(i).click();
		}
		page.locator("//*[@id='forms__radio']/ul/li[3]/label").click();
		// ------------------------------Text Area
		page.locator("#textarea").fill("This is Neepa from Arizona");
		// ------------------------varify Color input

		String color = "#000000";
		page.fill("#ic", color);
		String actualcolor = page.locator("#ic").getAttribute("value");
		if ("#00000f".equals(actualcolor)) {
			System.out.println("test case pass");
		} else {
			System.out.println("test case not pass");
		}
//	Thread.sleep(3000);
//page.locator("#in").fill("3");
		for (int i = 0; i < 2; i++) {
			// page.press("#in","ArrowUp");
			page.press("#in", "ArrowDown");
		}
//Thread.sleep(3000);
//	page.locator("//input[@id='ir']").click();
		Locator slider = page.locator("//input[@id='ir']");
		page.mouse().move(slider.boundingBox().x + slider.boundingBox().width / 2,
				slider.boundingBox().y + slider.boundingBox().height / 2);
		page.mouse().down();
		Thread.sleep(3000);
		// ----------------------------------------HTML5 inputs
		// Date Input
		page.locator("#idd").fill("2023-10-23");
//MONTH INPUT
		page.locator("#idm").fill("2023-11");
//Week input
		page.locator("#idw").fill("2023-W03");
//DateTime Input
		page.locator("#idt").fill("2023-11-16T10:15:00");
//Current Date Time
		LocalDateTime localDateTime = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
		String dateTimeValues = localDateTime.format(dateTimeFormatter);
		page.fill("#idtl", dateTimeValues);

		page.locator("#idl").fill("Example #2");
//----------------------------------------
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
