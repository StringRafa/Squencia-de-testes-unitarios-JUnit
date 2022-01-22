package application;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyFixture {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		System.out.println("Este método executa uma vez antes do primeiro teste!");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		System.out.println("Esse método executa uma vez após o último teste");
	}
	
	@Before
	public void setUp() throws Exception{
		System.out.println("Esse método executa antes de cada teste");
	}
	
	@After
	public void tearDown() throws Exception{
		System.out.println("Este método executa após cada teste!");
	}
	
	@Test
	public void test1() {
		System.out.println("Eu sou o teste 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Eu sou o teste 2");
	}
}
