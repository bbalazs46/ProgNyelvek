

public class TriangularNumbers {
    public static int getTriangularNumber(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}