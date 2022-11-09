package generics;

public class maxfloatsuc2 {
    public class mainclass {
        public static <T extends Comparable<T>> T maximum(T a, T b, T c){
            T max = a;

            if (b.compareTo(max) > 0)
                max = b;
            if (c.compareTo(max) > 0)
                max = c;

            return max;
        }

        public static void main(String[] args) {
            System.out.println("the max number of float is :" +maximum(4.4, 6.6, 7.7));
        }
    }
}
