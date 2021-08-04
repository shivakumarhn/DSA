package mathematics;

public class LCM {

    static int lcd(int a, int b) {

        // Naive solution,TC = O(a*b - max(a, b))
        int res = Math.max(a, b);
        while (true) {
            if (res % a == 0 && res % b == 0)
                return res;
            res++;
        }
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // Efficient solution, TC = O(log(min(a,b)))
    static int lcd2(int a, int b) {
        return (a * b) / gcd(a, b);   //derived from formula a * b = gcd(a, b) * lcd (a, b)
    }


    //My own solution
    static int lcd3(int a, int b){
        int res = Math.min(a, b);
        int temp = res;
        while(true){
            if(res % a ==0 && res % b == 0)
                return res;
            res +=temp;
        }
    }

    public static void main(String[] args) {

        int a = 400, b = 600;
        System.out.println(lcd(a, b));
        System.out.println(lcd2(a, b));
        System.out.println(lcd3(a, b));
    }
}
