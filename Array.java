package mouni;

public class Array {
    public static int mySqrt(int m) {
        if (m == 0) 
            return 0;
        int l = 1, r = m;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (mid <= m / mid && (mid + 1) > m / (mid + 1))
                return mid;
            else if (mid > m / mid) 
                r = mid - 1;
             else 
                l = mid + 1;   
        }
        return r;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
    }
}
