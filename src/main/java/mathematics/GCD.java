package mathematics;

public class GCD {

    // Naive solution, it decreases min number by 1 in each iteratio
    int gcd(int a, int b) {
        int res = Math.min(a, b);
        while (res != 0) {
            if (a % res == 0 && b % res == 0)
                break;
            res--;
        }
        return res;
    }

    // Solution using basic Euclidean algorithm
    int gcd2(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    // Optimized solution (To reduce repetitive subtraction)
    int gcd3(int a, int b) {
        if (b == 0)
            return b;
        return gcd3(b, a / b);
    }


    public static void main(String[] args) {

        GCD g = new GCD();
        System.out.println(g.gcd(12, 15));
        System.out.println(g.gcd2(25000, 30000));
        System.out.println(g.gcd2(250000, 30000));
    }
}
