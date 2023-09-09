package algo;
import java.util.*;

public class MeanMedianMode 
{
    // Function for calculating mean
    public static double findMean(int n , int a[])
    {
        int sum = 0;
        for (int i = 0; i < n; i++)

        sum += a[i];

    return (double)sum / (double)n;
}

public static double findMedian(int n, int a[])
{
    // First we sort the array
    Arrays.sort(a);

    // check for even case
    if (n % 2 != 0)
        return (double)a[n / 2];

    return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
}

public static int findMode(int n, int a[] ) {
    int maxValue = Integer.MAX_VALUE; // Note that a[0]+1 would also work
    int maxCount = 0;
    
    for (int i = 0; i < a.length; ++i) {
        int count = 0;
        for (int j = 0; j < a.length; ++j) {
            if (a[j] == a[i]) ++count;
        }
        if (count >= maxCount && a[i] < maxValue) {
            maxCount = count;
            maxValue = a[i];
        }
    }
    
    return maxValue;
}

// Driver code
public static void main(String args[])
{
    int a[] = { 41, 18467, 6334, 26500, 19169 };
    int n = a.length;

    System.out.println("Mean = " + String.format("%.6f", findMean(n, a)));
    System.out.println("Median = " + String.format("%.6f", findMedian(n, a)) );
    System.out.println("Mode = " + findMode(n, a));
}
}