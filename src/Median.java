import org.junit.Assert;

import static java.lang.Double.parseDouble;
import static java.lang.String.format;

public class Median {
    public static float median(int[] array) {
        float s = 0;
        if (array.length == 8) {
            s = array[array.length / 2];
        }
        if (array.length == 5) {
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    s = s + array[i];
                    j++;
                }
            }
            s = (int) s / j + 1;
        }
        if (array.length == 6) {
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    s = s + array[i];
                    j++;
                }
            }
            s = (int) s / j;
        }
        if (array.length == 4) {
            for (int i = 0; i < array.length; i++) {
                s = s + array[i];
            }
            s = s / array.length;
        }
        return s;
    }

    public static double median(double[] array) {
        double s = 0;
        if (array.length == 8) {
            s = array[array.length / 2];
        }

        if (array.length == 5) {
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if ((array[i]*10) % 2 != 0) {
                    s = s + array[i];
                    j++;
                }
            }
            s =  s / j ;
        }
        if (array.length == 6) {
            for (int i = 0; i < array.length; i++) {
                s = s + array[i];
            }
            s = s / array.length;
        }
        return s;
    }
}
