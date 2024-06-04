package pra1;

public class Main {
    public static void main(String[] args) {
        Comparator<Integer> comparator =
            (i1, i2) -> Integer.compare(Math.abs(i1), Math.abs(i2));
        int a = 50;
        int b = -51;
        int c = 3;
        System.out.println(comparator.compare(a, b));
        System.out.println(comparator.compare(a, c));
    }
}
