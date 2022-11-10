public class generic {

    public static <T extends Comparable<T>> T maximum(T a, T b, T c){
        T max = a;

        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;

        return max;
    }

    public static void main(String[] args) {
        System.out.println("the maximum number is :" +maximum(3, 4, 8));
        System.out.println("the max float number is :"+maximum(1.1,5.5,2.3));
        System.out.println("the max char is :"+maximum("generic", "method", "oops"));

    }
}

