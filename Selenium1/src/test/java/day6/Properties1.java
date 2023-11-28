package day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

import Base.Base;

public class Properties1 extends Base {
	@Test
	public void TC1() throws Exception {
		/*
		 * Properties Config = new Properties(); FileInputStream fis = new
		 * FileInputStream(".\\src\\test\\resources\\properties\\Config.properties");
		 * Config.load(fis);
		 * 
		 * System.out.println(Config.getProperty("browser"));;
		 */
		Properties Config = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\properties\\Config.properties");
		Config.load(fis);
		System.out.println(Config.getProperty("browser"));
	}

}
