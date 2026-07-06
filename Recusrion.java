public class Recusrion {
    public static void main(String[] args) {
        backTrackingRecusrion(5,5);
    }
// to print 1 to N
    public static void backTrackingRecusrion(int i,int n){
        if (i<1) {
            return;
        }
        backTrackingRecusrion(i-1,n);
        System.out.println(i);
    }
// to print N to 1
    public static void backTrackingRecusrion(int n){
        if (n<1) {
            return;
        }
        System.out.println(n);
        backTrackingRecusrion(n-1);
    }
}