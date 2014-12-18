package algorithm.lingying;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TestArrayElementMultiplication {
  
  @Test
  public void testArrayCalculation() {
    ArrayElementMultiplication calculation = new ArrayElementMultiplication();
    int[] A1 = {1, 2, 3, 4, 5};
    int[] res1 = {120, 60, 40, 30, 24};
    assertArrayEquals(res1, calculation.arrayCalculation(A1));
    
    int[] A2 = {2, 3, 4, 5, 6};
    int[] res2 = {360, 240, 180, 144, 120};
    assertArrayEquals(res2, calculation.arrayCalculation(A2));
  }

}
