package testcases;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Download;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DownLoad_file {

	public static void main(String[] args) {
		String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		Playwright playwright;
		playwright = Playwright.create();

		Browser browser;
		browser = playwright.chromium()
				.launch(new BrowserType.LaunchOptions().setHeadless(false).setExecutablePath(Paths.get(chromePath)));

		Page page;
		page = browser.newPage();

		page.navigate("https://datatables.net/");
		page.locator(
				"body > div.fw-container > div.fw-header.ad > div.nav-wrapper > div.nav-search > div.nav-item.i-download > a")
				.click();
		page.locator("body > div.fw-container > div.fw-body > div > ul > li:nth-child(2)").click();
		Download file = page.waitForDownload(() -> {
			page.locator("//a[@class='site-btn large']").click();
		});
		file.saveAs(Paths.get("C:\\java\\DataTables.zip"));
		
	

	}

}
