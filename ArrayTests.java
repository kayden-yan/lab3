import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {1,2,3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3,2,1}, input1);
	}

  @Test
  public void testReverseInPlace2() {
    int[] input1 = {2,1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{1,2}, input1);
	}

  @Test
  public void testReverseInPlace3() {
    int[] input1 = {1,2,3,4,5,6};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{6,5,4,3,2,1}, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = {1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] testArray = { 1.0 , 2.0 , 3.0, 4.0};
    double average = ArrayExamples.averageWithoutLowest(testArray);
    assertEquals(3.0, average, 0.01);
  }

  @Test
  public void testAverageWithMultipleLow() {
    double[] testArray = { 1.0, 2.0, 1.0, 3.0, 4.0};
    double average = ArrayExamples.averageWithoutLowest(testArray);
    assertEquals(3.0, average, 0.01);
  }
}
