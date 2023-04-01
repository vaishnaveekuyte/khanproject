package testing;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
public class testng {

	@BeforeClass
	
	public void beforeclass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method");
	}

	@Test  //(priority=1)                                           //validation point
		public void testA() {
		System.out.println("TestA ");
		}
	
	@Test (dependsOnMethods={"testC"})        //(enabled=false)      // (dependsOnMethods={"TestC"})               //(priority=4)                                                              //validation point
	public void testB()     {
		System.out.println("TestB ");
		}
	
	@Test  //(invocationCount=2)  //(priority=2)                                                               //validation point
	public void testC()   {
		System.out.println("TestC ");
		
		}
	
	@Test    //(timeOut=5000) //(priority=2)                                                                 //validation point
	public void testD() throws InterruptedException    {
		System.out.println("TestD ");
		Thread.sleep(2000);
	}
	
	
	@Test    //(priority=5)                                                                      //validation point
	public void testE() {
		System.out.println("TestE ");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("After Method ");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("After Class ");
	}
	
}
	
	
