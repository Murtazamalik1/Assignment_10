public class maximum_uc5 <T extends Comparable<T>>{
    T x, y, z;

    public maximum_uc5(T x, T y, T z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T maximum(){
        return maximum_uc5.maximum(x,y,z);
    }

    private static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (x.compareTo(max) > 0){
            max = y;
        }
        if (z.compareTo(max) > 0){
            max = z;
        }
        printmax((String) x, (String) y, (String) z, (String) max);
        return max;
    }

    public static String testMaximum(String x, String y, String z){
        String max = x;
        if (x.compareTo(max) > 0){
            max = y;
        }
        if (z.compareTo(max) > 0){
            max = z;
        }
        printmax(x, y, z, max);
        return max;
    }

    private static <T> void printmax(T x, T y, T z, T max) {
        System.out.printf("max is",x,y,z, max);

    }

    public static void main(String[] args) {
        Integer xInt = 5, yInt = 8, zInt = 4;
        Float xf1 = 6.6f, yf1 = 8.9F, zf1 = 6.7f;
        String xstr = "method", ystr = "generic", zstr = "oops";

        maximum_uc5.testMaximum(xstr, ystr, zstr);
        new maximum_uc5(xInt, yInt, zInt);
        new maximum_uc5(xf1, yf1, zf1);
        new  maximum_uc5(xstr, ystr, zstr);
    }


}
