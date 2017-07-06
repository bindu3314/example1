package sel.MVN;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	@BeforeMethod
	public void method1(){
		System.out.println("method1");
	}
		@AfterMethod
		public void method2(){
			System.out.println("method2");
		}
		@Test(priority=2)
		public void method3(){
			System.out.println("method3");
		}
		@Test(priority=1)
		public void method4(){
			System.out.println("method4");
		}
		
	}
