package Generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Scrennshotclass {
	
	public static void getScreenShot(WebDriver dr,String name)
	{
		TakesScreenshot t=(TakesScreenshot)dr;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/"+name+".png");
		try {
			FileUtils.copyFile(src, dest);
		} 
		
		catch (IOException e) 
		{
			
			
		}
	}

}
