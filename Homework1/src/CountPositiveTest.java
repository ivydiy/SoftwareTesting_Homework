// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 1, page 13
// JUnit tests for CountPositive.java 

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CountPositiveTest
{
   // this test fails!
   @Test public void arrayContainsZeroes() 
   {
      int arr[] = {-4, 2, 0, 2};
      assertEquals("Array contains zeroes", 2, CountPositiveRepaired.countPositive(arr));
   }
}