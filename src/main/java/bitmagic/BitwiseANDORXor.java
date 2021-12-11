package bitmagic;

public class BitwiseANDORXor {

    public static void main(String[] args) {

        int x = 3, y = 6;

        System.out.println(x & y); //Bitwise AND
        System.out.println(x | y); // Bitwise OR
        System.out.println(x ^ y); // Bitwise Xor
        System.out.println(~x); // Bitwise NOT

        // Left shift << operator
        System.out.println(x << 1);
        System.out.println(x << 2);
        y = 4;
        System.out.println(x << y);
        x = -1;
        System.out.println(x << 1);

        //Right shift >> operator
        x = 33;
        System.out.println(x >> 1);
        System.out.println(x >> 2);

        //Right shift >> operator for -ve numbers
        x = -2;
        System.out.println(x>>1);
        System.out.println(x>>2);

        //Unsigned right shift operator >>>
        x = -2;
        System.out.println(x>>>1);
        System.out.println(x>>>2);
    }
}
