public class IsThisATriangle {
    
    public static boolean isTriangle(int a, int b, int c) {

        if (a + b > c && b + c > a && c + a > b) {
            return true;
        }
        return false;
    }
}