package testcases;

import java.nio.file.Paths;
import java.util.ArrayList;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Lamda_expression {

//	public static void main(String[] args) {
//		//lamda expression
//				ArrayList<Integer>n=new ArrayList<Integer>();
//				n.add(5);
//				n.add(4);
//				n.add(3);
//				n.add(2);
//				n.add(1);
//				n.forEach((num2)->{
//					System.out.println(num2);
//				});
//				
//				
//				
//				
//				/*
//				 * Syntex of lamda expression
//				 *  When single parameter
//				 *   (parameter) ->Expression
//				 * 
//				 * When multiple parameter
//				 *  (parameter1,parameter2) ->{ //expression  }
//				 */
//			//	https://money.rediff.com/indices/nse/NIFTY-50?src=moneyhome_nseIndices
//			import java.nio.file.Paths;

	public static void main(String[] args) {
		Playwright playwright;
		playwright = Playwright.create();// enteract with the browser
		Browser browser;
		browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)// Show GUI mode
				.setExecutablePath(Paths.get("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe")));
		Page page;
		page = browser.newPage();// until here if I run it it would show me a blank page

		page.navigate("https://money.rediff.com/indices/nse/NIFTY-50?src=moneyhome_nseIndices");
		System.out.println("Table Row " + page.locator(".dataTable>tbody").locator("tr").count());
		System.out.println(
				"Table Colum " + page.locator(".dataTable>tbody").locator("tr:first-child").locator("td").count());
	System.out.println(page.locator("//tr[3]/td[3]").innerText());

		//assertThat(page.locator(".dataTable>tbody").locator("tr:first-child").locator("td:nth-child(2)"))
		//		.hasText("Nifty");
	///assertThat(page.locator("#leftcontainer > div.index-content > div.index-plotstats-wrapper > div.index-stats > div > div.indice-name")).hasText("Nifty 50");
	
		assertThat(page.locator(".dataTable>tbody").locator("tr:first-child").locator("td:nth-child(2)"))
		.hasText("Asian Paints Ltd");
	//	*****
		
        System.out.println(page.locator("//tr[3]/td[3]").innerText());
		
		System.out.println(page.locator("//tr[4]/td[1]").innerText());
		//Verify that actual inner text match with expected text 
		assertThat(page.locator("//*[@id=\"leftcontainer\"]/div[2]/div[2]/table/tbody/tr[4]/td[1]/a")).hasText("Asian Paints Ltd.");


	}

}
//******
//
//int rows=page.locator("//table").locator("//tr").count();
//System.out.println("total row of this  table is "+rows);
//
//int thead=page.locator("//table//thead//tr[1]").locator("//th").count();
//System.out.println("total Table header "+thead);
//
//int tfoot=page.locator("//table//tfoot//tr[1]").locator("//th").count();
//System.out.println("total Table fotter "+tfoot);
//
//String cell=page.locator("//table//tbody//tr[1]").locator("//td[1]").innerText();
//System.out.println("Table Data is : "+cell);
//
//Locator assCell=page.locator("//table//tbody//tr[1]").locator("//td[1]");
//assertThat(assCell).hasText("Table Cell 1");
//****
//
//assertThat(page.locator("//*[@id=\"leftcontainer\"]/div[2]/div[2]/table/tbody/tr[4]/td[1]/a")).hasText("Asian Paints Ltd.");
//
//
//System.out.println("Price is : "+page.locator("//tr[4]/td[3]").innerText());
//System.out.println("Price is : "+page.locator("//tr[4]/td[4]").innerText());
//page.close();
