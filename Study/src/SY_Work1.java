public class SY_Work1 {
    private int A;
    private int B;
    private int X;
    public static void main(String[] args) { }
    public void test(){
        if((A > 1) && (B == 0)){
            X = X / A;
        }

        if((A == 2) || (X > 1)){
            X = X + 1;
        }
    }
    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    public SY_Work1() {
    }

    public int getX() {
        return X;
    }


    public void setX(int x) {
        X = x;
    }

    public SY_Work1(int a, int b, int x) {
        A = a;
        B = b;
        X = x;
    }


}
