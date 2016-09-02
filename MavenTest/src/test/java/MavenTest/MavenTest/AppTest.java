package MavenTest.MavenTest;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import jxl.JXLException;
import jxl.read.biff.BiffException;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	static WebDriver driver = new FirefoxDriver();
	static String title;
	static String acttitle;
	@BeforeClass
	public static void initialize() throws IOException 
	{
		title="Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com";
	}
	
	@Test
	public void testApp() throws NumberFormatException, BiffException, JXLException, IOException 
	{
		driver.get(System.getenv("url"));
		acttitle = driver.getTitle();
		
		if(acttitle.equals(title))
		{
			System.out.println("Match");
		}
		else
			System.out.println("No Match");
	}
	
	@AfterClass
	public static void endScript() 
	{
		driver.close();
	}
	
}
