package com.sts;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\library\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200/");
		driver.manage().window().maximize();
		sleep();
		driver.findElement(By.id("name")).sendKeys("kashi");
		sleep();
		driver.findElement(By.name("address")).sendKeys("pune");
		sleep();
		driver.findElement(By.id("percentage")).sendKeys("90");
		sleep();
		driver.findElement(By.id("Register")).click();
	}
		/*System.out.println("select your method:");
		System.out.println("1.googletest:");
		System.out.println("2.auto:");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			googletest();
			break;
		case 2:
			auto();
			break;
		default:
			System.out.println("you choose wrong");
		}

	}*/

		/*
		 * private static void googletest() throws InterruptedException { WebDriver
		 * driver = new ChromeDriver();
		 */
		/*driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("selenium");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"btnK\"]")).sendKeys("Keys.ENTER");
		driver.close();
	}
*/
		/*
		 * private static void auto() throws InterruptedException { WebDriver driver =
		 * new ChromeDriver(); driver.get("http://localhost:4200/");
		 * driver.manage().window().maximize(); sleep();
		 * driver.findElement(By.id("name")).sendKeys("kashi"); sleep();
		 * driver.findElement(By.name("address")).sendKeys("pune"); sleep();
		 * driver.findElement(By.id("percentage")).sendKeys("90"); sleep();
		 * driver.findElement(By.id("Register")).click();
		 * 
		 * }
		 */
	private static void sleep(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}