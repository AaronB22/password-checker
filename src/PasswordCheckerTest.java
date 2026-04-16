import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  
  @Test 
  public void checksIfPasswordLengthReturnsCorrect(){
    PasswordChecker plength= new PasswordChecker(6, 12);

    String actualMed= plength.describePasswordLength("aaronB");
    String actualLong= plength.describePasswordLength("ThisIsALongPassword");
    String actualShort = plength.describePasswordLength("short");

    assertEquals("short", actualShort);
    assertEquals("medium", actualMed);
    assertEquals("long", actualLong);

  }

}
