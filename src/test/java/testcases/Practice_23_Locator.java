package testcases;

//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.YearMonth;
//import java.time.format.DateTimeFormatter;
//import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
public class Practice_23_Locator {

	public static void main(String[] args) {
//		import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
//		// First child Row count
//		  System.out.println("First child Row: " + page.locator(".dataTable>tbody").locator("tr:first-child").count());
//		  System.out.println("First child Column: "
//		    + page.locator(".dataTable>tbody").locator("tr:first-child").locator("td").count());
//		// Second Child column count
//		  System.out.println("Second child Column: "
//		    + page.locator(".dataTable>tbody").locator("tr:nth-child(2)").locator("td").count());
//
//		  // Verify column Text
//		  assertThat(page.locator(".dataTable>tbody").locator("tr:first-child").locator("td:nth-child(2)")).hasText("Table Cell 2");
//		  
//		  // Total table text print
//		  page.locator(".dataTable>tbody").allInnerTexts().forEach(text -> System.out.println(text));

		////
//	page.navigate("file:///C:/Batch23May-SDET%20with%20Java-Playwright/classes/Class%2023%20-%20Playwright%20-%20Locators/html-all.html");
//	
//	//File Upload
//	page.locator("//input[@id='input__file']").setInputFiles(  Paths.get("C:\\java\\Data.txt")   );
//	
//	
//	//Select Animal
//	page.selectOption("//select[@id='select_animal']", "Cat");
//	
//	
//	//Select Multiple
//	String[] multSelectionValues =  {"Option One", "Option Three"};
//	page.selectOption("//select[@id='select_multiple']", multSelectionValues);
//
//	//find text in 3rt Row and 2 col
//	System.out.println( page.locator("//tr[3]/td[2]").innerText() );
//	
//	int[] age = {23,56,78,45,61};
//	String[] name = {"23","56","78","45","61"};
//	
//}
//}

	


//***********
// Input File
// Used X-path
//page.locator("//*[@id=\"input__file\"]").setInputFiles(Paths.get("C:\\Java\\webpage\\Bangladesh.jpg"));
//
//// (===============================================)
//
//// Select single menus
//page.selectOption("select", "Option Three");
//// Select multiple menus
//String selectSelector = "#select_multiple";
//// Select multiple options from the multi-select menu
//String[] valuesToSelect = { "Option One", "Option Two", }; // Replace with the values you want to select
//page.selectOption(selectSelector, valuesToSelect);
//
//// Multiple check boxes
//// Locator block = page.locator("//*[@id='forms__checkbox']");
//Locator checkboxes = page.locator("[type='checkbox']");
//for (int i = 1; i < checkboxes.count(); i++) {
//	checkboxes.nth(i).click();
//}
//
//// Select radio buttons
//page.locator("//*[@id='forms__radio']/ul/li[3]/label").click();
//
//// Test Areas
//page.locator("//*[@id='textarea']").type("This is Test Web Side in Playwright");
//
//// (Clss02 ===============================================)
//try {
//	Thread.sleep(2000);
//
//} catch (InterruptedException e) {
//	e.printStackTrace();
//
//}
//
//page.mouse().move(slider.boundingBox().x + slider.boundingBox().width / 2,
//		slider.boundingBox().y + slider.boundingBox().height / 2);
//
//page.mouse().down();
//
//page.mouse().move(slider.boundingBox().x + 100, slider.boundingBox().y + slider.boundingBox().height / 2);
//page.mouse().up();
//
//// Date Input
//LocalDate currentDate = LocalDate.now();
//String formattedDate = currentDate.toString(); // Format the date as per your requirements
//System.out.println(formattedDate);
//// Fill the date input field with the current date
//page.fill("//*[@id='idd']", formattedDate);
//
//// Month Input
//// Get the current month in the desired format
//YearMonth currentMonth = YearMonth.now();
//String formattedMonth = currentMonth.toString(); // Format the month as per your requirements
//System.out.println(formattedMonth);
//// Fill the date input field with the current month
//page.fill("#idm", formattedMonth);
//page.mouse().up();
////Week Input
//		// Input the week value
//		// String weekValue = "2023-W45"; // Replace with the desired week value
//		// page.fill("#idw", weekValue);
//
//		// Get the current week in the desired format
//		LocalDate nows = LocalDate.now();
//		String currentWeek = nows.format(DateTimeFormatter.ofPattern("yyyy-'W'ww", Locale.US));
//		page.fill("#idw", currentWeek);
//
//		// Time Input
//		// Get the current date and time in the desired format
//		LocalDateTime now = LocalDateTime.now();
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
//		String dateTimeValue = now.format(formatter);
//		page.fill("#idt", dateTimeValue);
//
//		// Datetime-local input
//		// Get the current date and time in the desired format
//		LocalDateTime nowss = LocalDateTime.now();
//		DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
//		String dateTimeValues = nowss.format(formatters);
//page.fill("#idtl", dateTimeValues);
//
//		// DataList
//		page.fill("#idl", "Example #2");
//		
//		// Web Table Handling
//		// Total Row count
//		System.out.println("Row "+page.locator(".dataTable>tbody").locator("tr").count());
//		
//		//Total Column count
//		System.out.println("Column "+page.locator(".dataTable>tbody>tr").locator("td").count());
//		
//		// First-child column count
//		System.out.println("First Child Column "+page.locator(".dataTable>tbody").locator("tr:first-child").locator("td").count());
//		
//		// Second-child column count
//		System.out.println("Second Child Column "+page.locator(".dataTable>tbody").locator("tr:nth-child(2)").locator("td").count());
//		
//		// Verify column Text
//		assertThat(page.locator(".dataTable>tbody").locator("tr:first-child").locator("td:nth-child(2)")).hasText("Table Cell 2");
//		
//		// Total table Text print(used lambda)
//		page.locator(".dataTable>tbody").allInnerTexts().forEach(text -> System.out.println(text));
////Verify Pre-formatted text
//		String welcomeMsg = page.textContent("#text__code > div > h2");
//		if (welcomeMsg.contains("Pre-formatted text"))
//			System.out.println("Test is Pass");
//		else
//			System.out.println("Test is Fail");
//
//}
//
}
}


 





