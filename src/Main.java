import arithmetic.Arithmetic;
import map.MyMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Double a = 10.2;
        Short b = 2;

        Arithmetic<Double, Short> test1 = new Arithmetic<>(a, b);
        System.out.println(test1.add());
        System.out.println(test1.subtract());
        System.out.println(test1.multiply());
        System.out.println(test1.divide());
        System.out.println(test1.getMin());
        System.out.println(test1.getMax());

        MyMap<Integer, String> test2 = new MyMap<>();
        test2.put(10, "ten");
        test2.put(15, "fifteen");
        test2.put(5, "five");
        test2.put(0, "zero");

        System.out.println(test2.get(10));
        System.out.println(test2.get(15));
        System.out.println(test2.remove(5));
        System.out.println(test2.remove(5));
    }
}