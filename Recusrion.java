public class Recusrion {
    public static void main(String[] args) {
        backTrackingRecusrion(5,5);
    }

    public static void backTrackingRecusrion(int i,int n){
        if (i<1) {
            return;
        }
        backTrackingRecusrion(i-1,n);
        System.out.println(i);
    }
}