package Base;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base_Page {

	public static WebDriver driver;
	public static String url;
	public static ExtentReports extentreport;
	public static ExtentTest extentTest;
	Properties properties = new Properties();
	Method m;

	public Base_Page() throws IOException {
		FileInputStream data = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\Config.properties");
		properties = new Properties();
		properties.load(data);

	}

	public WebDriver getDriver() throws IOException {
		FileInputStream data = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\Config.properties");
		properties = new Properties();
		properties.load(data);
		if (properties.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\91728\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (properties.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\main\\java\\Drivers\\chromedriver.exe");
		} else {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\main\\java\\Drivers\\chromedriver.exe");
		}
		driver.manage().window().maximize();
		return driver;

	}

	public String getURL() throws IOException {
		FileInputStream data = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\Config.properties");
		properties = new Properties();
		properties.load(data);
		url = (String) properties.get("url");
		return url;

	}

	public static String getScreenshot(String name) throws IOException {
		TakesScreenshot scrshot = (TakesScreenshot) driver;
		File srcFile = scrshot.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss");
		Date date = new Date();
		String screenshotName = formatter.format(date) + ".png";
		File destFile = new File("./Screenshots/" + name + " " + screenshotName);

		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return destFile.getAbsolutePath();

	}

	@BeforeSuite
	public void createExtentReports() {
		extentreport = new ExtentReports();
		ExtentSparkReporter Sparkreport = new ExtentSparkReporter("Reports.html");
		extentreport.attachReporter(Sparkreport);
		extentreport.setSystemInfo("OS", System.getProperty("os.name"));
		extentreport.setSystemInfo("Java Version", System.getProperty("java.version"));
	}

	@BeforeMethod
	public void reporting(Method m) {
		extentTest = extentreport.createTest(m.getName());
	}

	@AfterMethod
	public void checkStatus(Method m, ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			String name = m.getName();
			String path = getScreenshot(name);
			extentTest.fail(m.getName() + " is failed").addScreenCaptureFromPath(path, m.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			extentTest.pass(m.getName() + " Is Passed");
		}
	}

	@AfterSuite
	public void flush() throws IOException {
		extentreport.flush();
		Desktop.getDesktop().browse(new File("Reports.html").toURI());

	}

}
