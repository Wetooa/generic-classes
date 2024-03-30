package arithmetic;

public class Arithmetic<A extends Number, B extends Number> {
    private final A a;
    private final B b;

    public Arithmetic(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public Number add() {
        double r = a.doubleValue() + b.doubleValue();
        return r == (int) r ? (int) r : r;
    }

    public Number subtract() {
        double r = a.doubleValue() + b.doubleValue();
        return r == (int) r ? (int) r : r;
    }

    public Number multiply() {
        double r = a.doubleValue() + b.doubleValue();
        return r == (int) r ? (int) r : r;
    }

    public Number divide() {
        double r = a.doubleValue() + b.doubleValue();
        return r == (int) r ? (int) r : r;
    }

    public Number getMin() {
        double r = Math.min(a.doubleValue(), b.doubleValue());
        return r == (int) r ? (int) r : r;
    }

    public Number getMax() {
        double r = Math.max(a.doubleValue(), b.doubleValue());
        return r == (int) r ? (int) r : r;
    }

}
