package hello;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestNGSimpleTest {

   @Test
   public void testAdd4() {
      String str = "TestNG is working fine";
      Assert.assertEquals("TestNG is working fine", str);
   }
   @Test
   public void testAdd5() {
      String str = "TestNG is working fine";
      Assert.assertEquals("TestNG is working fine", str);
   }
   @Test
   public void testAdd6() {
      String str = "TestNG is working fine";
      Assert.assertEquals("TestNG is working fine", str);
   }
 
}