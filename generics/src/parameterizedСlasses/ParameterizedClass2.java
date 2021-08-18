package parameterizedСlasses;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Hello", 21);
        System.out.println("Value1 = " + pair1.getValue1());
        System.out.println("Value2 = " + pair1.getValue2());

        Pair<Integer, Double> pair2 = new Pair<>(14, 4.4);
        System.out.println("Value1 = " + pair2.getValue1());
        System.out.println("Value2 = " + pair2.getValue2());

    }
}
