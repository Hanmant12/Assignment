package junitpractice;

import org.junit.BeforeClass;
import org.junit.Test;

public class beforeclassann {

	@BeforeClass
	//@Test
	public static void annt()
	{
		System.out.println("hey i am in ");
	}
	@Test
	public void show()
	{
		System.out.println("i am");
	}
}
