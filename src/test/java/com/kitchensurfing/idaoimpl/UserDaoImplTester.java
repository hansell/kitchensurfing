package com.kitchensurfing.idaoimpl;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*; 
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kitchensurfing.config.core.KitchenSuringServiceConfig;
import com.kitchensurfing.idaoimpl.UserDaoImpl;
import com.kitchensurfing.po.User;

/**
 * 
 * @author Hansel
 *
 */
public class UserDaoImplTester {
	@SuppressWarnings({  "rawtypes" })
	private Collection collection;
	private static UserDaoImpl ds;
	  @BeforeClass
	    public static void oneTimeSetUp() {
	        // one-time initialization code   
			@SuppressWarnings("resource")
			AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
					KitchenSuringServiceConfig.class);
		     ds = ctx.getBean(UserDaoImpl.class);
	    	System.out.println("@BeforeClass - oneTimeSetUp");
	    }
	    @SuppressWarnings({ "rawtypes", "unchecked" })
		@Before
	    public void setUp() {
	        collection = new ArrayList();
	        collection.add(new Integer(1));
	        System.out.println("@Before - setUp");
	    }
	   @Test 
	   public void getUserPasswordByAccount(){
		  //assertEquals("dd", ds.getUserPassword(2));
		   assertEquals("i love you 520", ds.getUserPassword("919183005@qq.com"));
	   }
	   /**
	    * Hamcrest
	    */
	   @Test
	   public void getUserPasswordByUserId(){
		   assertEquals("xiaoyingfeng2012", ds.getUserPassword(2));
		   assertThat("", anything());
	   }
	   @Ignore("I have run")  
	 @Test
	 public void addUser(){
		 assertTrue(ds.addUser(new User(1,"anna","919183005@qq.com","i love you 520")));
		 assertTrue(ds.addUser(new User(1,"hansell","xiaoyingfeng2012@gmail.com","xiaoyingfeng2012")));
	 }
	@Test
	public void getUser(){
		assert(collection.size()==1);
		User user=ds.getUser("919183005@qq.com", "i love you 520");
		assertTrue(user.getUsername().equals("anna"));
		System.out.println(user.getUserPassword()+"---------------------");
	}
	@Test
	public void selectAll() {
	  List<User> list=ds.selectAll();
	  for (User user:list){
		  System.out.println(user.getAccount());
	  }
	}
	@Test
	public void isUserExists(){
		assertTrue(ds.isUserExists(new User("hansell","xiaoyingfeng2012@gmail.com", "xiaoyingfeng2012")));
		assertTrue(ds.isUserExists("hanselldd"));
	}
   @Test
   public void getAllUser(){
	   
	   List<User> list=ds.getAllUser();
		  for (User user:list){
			  System.out.println(user.getAccount());
		  }
	}
   @Test
   public void getAll(){
	   List<Map<String,Object>> list=ds.getAll();
	   for (Object result : list) {
           HashMap<String,Object> map = (HashMap<String,Object>) result;
           for (Object key : map.keySet()) {
               System.out.print(key + " = " + map.get(key) + "; ");
           }
           System.out.println();
       }
   }

	    /**
	     * JUnit Expected Exception Test
	     */
	    @Test(expected = ArithmeticException.class)  
		public void divisionWithException() {  
		  int i = 1/0;
		} 
	    /**
	     * JUnit Ignore Test
	     * This ¡°Ignored¡± means the method is not ready to test, the JUnit engine will just bypass this method.
	     */
	    @Ignore("Not Ready to Run")  
		@Test
		public void ignoreJunitTest() {  
		  System.out.println("Method is not ready yet");
		}  
	    /**
	     * JUnit TimeOut Test
	     * The ¡°Time Test¡± means if an unit test takes longer 
	     * than the specified number of milliseconds to run, the test will terminated and mark as failed.
	     *
	     */
	    @Test(timeout = 1000)  
		public void infinity() {  
			while (true);  
		}  
	    @After
	    public void tearDown() {
	        collection.clear();
	        System.out.println("@After - tearDown");
	    }
	    @AfterClass
	    public static void oneTimeTearDown() {
	        // one-time cleanup code
	    	System.out.println("@AfterClass - oneTimeTearDown");
	    }
}
