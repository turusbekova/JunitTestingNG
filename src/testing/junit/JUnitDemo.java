package testing.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitDemo {

    public static void main(String[] args) {
        JUnitDemo jUnitDemo = new JUnitDemo();
        System.out.println(jUnitDemo.add(5, 6));
    }

    public int add(int a, int b) {
        int res = a + b;
        return res;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public boolean isBishkek(String city){
        return city.equals("Bishkek");
    }

    @Test
    public void testIsBishkek(){
        Assertions.assertFalse(isBishkek("Bishkek"));
        Assertions.assertTrue(isBishkek("bishkek"));
    }

    @Test // Annotations, Он используется чтобы пометить метод как тест junit
    public void testAdd() {
        // 5,6
        // 10,10
        int expectedValue = 11;
        int expectedValue2 = 20;
        Assertions.assertEquals(expectedValue, add(5, 6));
        Assertions.assertEquals(expectedValue2, add(10, 10));
    }

    @Test
    public void testMinus(){
        // 10,9
        int expectedValue = 1;
        Assertions.assertEquals(expectedValue,minus(10,9));
    }
}