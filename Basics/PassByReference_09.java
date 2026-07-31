public class PassByReference_09 {

    static class Number {
        int value;
    }

    public static void changeValue(Number num) {
        num.value += 5;
        System.out.println(num.value);

        num.value += 5;
        System.out.println(num.value);
    }

    public static void main(String[] args) {
        Number n = new Number();
        n.value = 10;

        System.out.println("Before: " + n.value);

        changeValue(n);

        System.out.println("After: " + n.value);
    }
}