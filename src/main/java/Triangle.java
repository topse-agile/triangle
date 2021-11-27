import java.util.Arrays;

public class Triangle {

    enum Type {
        INVALID,
        EQUILATERAL,
        ISOSCELES,
        SCALENE,
    };

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        int[] values = { a, b, c };
        Arrays.sort(values);
        this.a = values[0];
        this.b = values[1];
        this.c = values[2];
    }

    public Type check() {
        if (c > a + b) {
            return Type.INVALID;
        } else if (a == b && b == c) {
            return Type.EQUILATERAL;
        } else if (a == b || b == c) {
            return Type.ISOSCELES;
        } else {
            return Type.SCALENE;
        }
    }
}
