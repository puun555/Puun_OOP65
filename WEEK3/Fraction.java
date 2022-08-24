public class Fraction {
    public int topN;
    public int btmN;

    public String toFraction() {
        return topN + "/" + btmN;
    }

    public String toFloat() {
        double topN2 = topN, btmN2 = btmN;
        double ans = topN2/btmN2;
        String text = Double.toString(ans);
        return text;
    }

    public void addFraction(Fraction f) {
        if (btmN == f.btmN){
            topN = topN+f.topN;
        } else{
            topN = topN*f.btmN+f.topN*btmN;
            btmN = btmN*f.btmN;
        }
    }

    public boolean myEquals(Fraction x) {
        double r1, r2;
        r1 = x.topN * btmN;
        r2 = x.btmN * topN;
        return (Math.abs(r1-r2) < 0.01);
    }

    public void LowestTermFrac(){
        int d ;
        d = __gcd(topN, btmN);
        topN = topN / d;
        btmN = btmN / d;

    }
    public int __gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return __gcd(b, a%b);
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        f1.topN = 1;
        f1.btmN = 3;
        Fraction f2 = new Fraction();
        f2.topN = 4;
        f2.btmN = 16;
        Fraction f3 = new Fraction();
        f3.topN = 5;
        f3.btmN = 15;

        System.out.println(f1.toFloat());
        System.out.println(f2.toFloat());
        System.out.println(f3.toFloat());
        System.out.println("f1 is equal to f2 >> " + f1.myEquals(f2));
        System.out.println("f1 is equal to f3 >> " + f1.myEquals(f3));
        System.out.println("Before : " + f2.toFraction());
        f2.LowestTermFrac();
        System.out.println("After : " + f2.toFraction());
    }

    // public static void main(String[] args) {
    //     Fraction f1 = new Fraction();
    //     f1.topN = 2;
    //     f1.btmN = 5;
    //     Fraction f2 = new Fraction();
    //     f2.topN = 3;
    //     f2.btmN = 7;
    //     System.out.println("before " + f1.toFraction());
    //     System.out.println("before " + f1.toFloat());
    //     f1.addFraction(f2);
    //     System.out.println("after " + f1.toFraction());
    //     System.out.println("after " + f1.toFloat());
    // }
}
