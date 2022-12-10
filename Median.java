import org.junit.Assert;

public class Median {
    public static float median(int[] array) {
        float s=0;
        for (int i = 0; i < array.length; i++) {
           s=s+array[i];}
        s=s/ array.length;
        return s;
    }
    public static double median(double[] array){
        double s=0;
        for (int i = 0; i < array.length; i++) {
            s=s+ array[i];}
        s= s/array.length;
        return s;
    }

}
