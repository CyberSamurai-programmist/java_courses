package parameterizedСlasses;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Hello");
        System.out.println(info1);
        String s =  info1.getValue();

        Info<Integer> info2 = new Info<>(11);
        System.out.println(info2);
        Integer i = info2.getValue();
    }
}
