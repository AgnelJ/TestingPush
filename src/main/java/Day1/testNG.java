package Day1;

	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class testNG {
		 @Test
		    public void test() {
		        System.out.println("Test");
		    }    
	    @BeforeSuite
	    public void beforesuite() {
	        System.out.println("BeforeSuite");
	    }    
	    @BeforeTest
	    public void beforetest() {
	        System.out.println("BeforeTest");
	    }    
	    @BeforeClass
	    public void beforeclass() {
	        System.out.println("Beforeclass");
	    }    
	    @BeforeMethod
	    public void beforemethod() {
	        System.out.println("BeforeMethod");
	    }	    
	   
	    @AfterMethod
	    public void aftermethod() {
	        System.out.println("AfterMethod");
	    }	    
	    @AfterClass
	    public void afterclass() {
	        System.out.println("AfterClass");
	    }    
	    @AfterTest
	    public void aftertest() {
	        System.out.println("AfterTest");
	    }	    
	    @AfterSuite
	    public void afterSuite() {
	        System.out.println("AfterSuite");

	    }
}
