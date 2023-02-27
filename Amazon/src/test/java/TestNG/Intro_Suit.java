package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Intro_Suit {
	
	
	
//  Annotation        TagName
	
   @BeforeSuite     // suit
    public void beforeSuit() {
	System.out.println("before suit");
    }
   
   @BeforeTest         // test
   public void beforeTest() {
	   System.out.println("before Test");
   }

	@BeforeClass           // class
	public void beforeclass() {
		System.out.println("Before Class");
	}

	@BeforeMethod         // include
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}
	
	@Test               // include
	public void test() {
		System.out.println(" test ");
	}
	
	@AfterMethod         // include
	public void aftermethod() {
		System.out.println("after method");
	}
	
	@AfterClass            // class
	public void afterclass() {
		System.out.println("after class");
	}
	
	@AfterTest            // test
	public void afterTest() {
		System.out.println("after Test");
	}
	
	@AfterSuite           // suit
	public void afterSuit() {
	    System.out.println("after suit");
	}
	
}

// " include " are use to execute specific method in testNG class 
// before that " method " Tagname are uesd
