import static org.junit.Assert.*;

public class PalindromeTest {

    @org.junit.Test
    public void palindromeCheck1() {
        Palindrome object=new Palindrome();
        String realValue=object.PalindromeCheck(12321);
        String expectedOutput="12321 is a palindrome and the sum of even numbers is less than 25";
    assertEquals(expectedOutput,realValue);
    }
    @org.junit.Test
    public void palindromeCheck2() {
        Palindrome object=new Palindrome();
        String realValue=object.PalindromeCheck(2843482);
        String expectedOutput="2843482 is a palindrome and the sum of even numbers is greater than 25";
        assertEquals(expectedOutput,realValue);
    }
}