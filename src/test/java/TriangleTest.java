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
    public void testInvalid_5_10_4() {
        Triangle triangle = new Triangle(5, 10, 4);

        Triangle.Type type = triangle.check();

        assertThat(type, is(Triangle.Type.INVALID));
    }

    @Test
    public void testInvalid_5_4_10() {
        Triangle triangle = new Triangle(5, 4, 10);

        Triangle.Type type = triangle.check();

        assertThat(type, is(Triangle.Type.INVALID));
    }

    @Test
    public void testEquilateral_3_3_3() {
        Triangle triangle = new Triangle(3, 3, 3);

        Triangle.Type type = triangle.check();

        assertThat(type, is(Triangle.Type.EQUILATERAL));
    }

    @Test
    public void testIsosceles_5_3_3() {
        Triangle triangle = new Triangle(5, 3, 3);

        Triangle.Type type = triangle.check();

        assertThat(type, is(Triangle.Type.ISOSCELES));
    }

    @Test
    public void testIsosceles_3_3_5() {
        Triangle triangle = new Triangle(3, 3, 5);

        Triangle.Type type = triangle.check();

        assertThat(type, is(Triangle.Type.ISOSCELES));
    }

    @Test
    public void testScalene_3_4_5() {
        Triangle triangle = new Triangle(3, 4, 5);

        Triangle.Type type = triangle.check();

        assertThat(type, is(Triangle.Type.SCALENE));
    }

}
