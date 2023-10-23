import java.io.*;
import java.util.*;

public class BetweenTwoSets {

    static int getTotalX(int[] a, int[] b) {
        int count = 0;

        for (int i = a[a.length - 1]; i <= b[0]; i++) {
            boolean isFactor = true;
            for (int j = 0; j < a.length; j++) {
                if (i % a[j] != 0) {
                    isFactor = false;
                    break;
                }
            }
            if (isFactor) {
                boolean isMultiple = true;
                for (int k = 0; k < b.length; k++) {
                    if (b[k] % i != 0) {
                        isMultiple = false;
                        break;
                    }
                }
                if (isMultiple) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = reader.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[] a = new int[n];
        String[] aItems = reader.readLine().split(" ");
        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr]);
            a[aItr] = aItem;
        }

        int[] b = new int[m];
        String[] bItems = reader.readLine().split(" ");
        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr]);
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);
        System.out.println(total);
    }
}
