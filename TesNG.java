import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.Before;

public class TesNG {

	@BeforeTest
	public void maiBEFOREn() {
		System.out.println("hi2");
	}
	
	@AfterTest
	public void AFTER() {
		System.out.println("hi2");
	}
	
	@Test(priority = 2,description = "jameel")
	
	public void main() {
		System.out.println("hi");
	}
	
	@Test(priority = 1,description = "dafdaf")
	public void jam()
	{
		System.out.println("dsd");
	

}
}