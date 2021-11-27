import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TriangleTest {

    private void checkType(int a, int b, int c, Triangle.Type expected) {
        Triangle triangle = new Triangle(a, b, c);

        Triangle.Type type = triangle.check();

        assertThat(type, is(expected));
    }

    @Test
    public void testInvalid_10_5_4() {
        checkType(10, 5, 4, Triangle.Type.INVALID);
    }

    @Test
    public void testInvalid_5_10_4() {
        checkType(5, 10, 4, Triangle.Type.INVALID);
    }

    @Test
    public void testInvalid_5_4_10() {
        checkType(5, 4, 10, Triangle.Type.INVALID);
    }

    @Test
    public void testEquilateral_3_3_3() {
        checkType(3, 3, 3, Triangle.Type.EQUILATERAL);
    }

    @Test
    public void testIsosceles_5_3_3() {
        checkType(5, 3, 3, Triangle.Type.ISOSCELES);
    }

    @Test
    public void testIsosceles_3_3_5() {
        checkType(3, 3, 5, Triangle.Type.ISOSCELES);
    }

    @Test
    public void testScalene_3_4_5() {
        checkType(4, 3, 5, Triangle.Type.SCALENE);
    }

}
