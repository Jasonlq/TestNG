package hello;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Sample2 {

   @Test
   public void testAdd() {
      String str = "TestNG is working fine";
      Assert.assertEquals("TestNG is working fine", str);
   }
   @Test
   public void testAdd2() {
      String str = "TestNG is working fine";
      Assert.assertEquals("TestNG is working fine", str);
   }
   @Test
   public void testAdd3() {
      String str = "TestNG is working fine";
      Assert.assertEquals("TestNG is working fine", str);
   }
 
}