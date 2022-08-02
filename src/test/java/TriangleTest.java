import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TriangleTest {

    @Test
    public void testInvalid_10_5_4() {
        Triangle triangle = new Triangle(10, 5, 4);

        Triangle.Type type = triangle.check();

        assertThat(type, is(Triangle.Type.INVALID));
    }

    @Test
    public void testEquilateral_5_5_5() {
        Triangle triangle = new Triangle(5, 5, 5);

        Triangle.Type type = triangle.check();

        assertThat(type, is(Triangle.Type.EQUILATERAL));
    }

    @Test
    public void testIsosceles_5_5_3() {
        Triangle triangle = new Triangle(5, 5, 3);

        Triangle.Type type = triangle.check();

        assertThat(type, is(Triangle.Type.ISOSCELES));
    }

    @Test
    public void testIsosceles_5_3_5() {
        Triangle triangle = new Triangle(5, 3, 5);

        Triangle.Type type = triangle.check();

        assertThat(type, is(Triangle.Type.ISOSCELES));
    }

    @Test
    public void testIsosceles_3_5_5() {
        Triangle triangle = new Triangle(3, 5, 5);

        Triangle.Type type = triangle.check();

        assertThat(type, is(Triangle.Type.ISOSCELES));
    }

    @Test
    public void testIsosceles_3_4_5() {
        Triangle triangle = new Triangle(3, 4, 5);

        Triangle.Type type = triangle.check();

        assertThat(type, is(Triangle.Type.SCALENE));
    }
}
