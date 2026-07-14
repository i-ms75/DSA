public class Recusrion {
    public static void main(String[] args) {
        // backTrackingRecusrion(5,5);
        // sum(5,0);
        // System.out.println("Sum is: "+sumWithFunction(5));
        // System.out.println("Factorial is: "+factorial(5));

        // int arr[]={3,2,5,9,4,7,8};
        // int arr[]={1,2,3,4,5,6,7,8};
        // arrayReversal(arr,0,arr.length-1);
        // String pal="1221";
        // System.out.print(paliindrome(pal.toCharArray(), 0));
        System.out.println(fibonacci(10));

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

    // sum with parametric approach
    public static void sum(int i, int sum)
    {
        if (i<1) {
            System.out.println("the sum is: "+sum);
            return;            
        }
        sum(i-1, sum+i);

    }

    // Sum with functional approach
    public static int sumWithFunction(int i)
    {
        if(i<1)
            return i;
        return i+sumWithFunction(i-1);
    }

    // Factorial
    public static int factorial(int n)
    {
        if(n<1)
            return 1;
        return n*factorial(n-1);
    }

    // reversing an array
    public static void arrayReversal(int array[], int i,int j)
    {
        // 3,2,5,9
        
        if ( j<i) {
            for (int element:array)
                {
                    System.out.print(element);
                }
            return;
        }
        int temp=0;
        temp=array[i];
        array[i]=array[j];
        array[j]=temp;
        arrayReversal(array, i+1, j-1);
        

    }

    // Palidrome string
    public static boolean paliindrome( char s[],int i)
    {
        int length=s.length-1;
        if(i>length/2)
            return true;
        if(s[i]!=s[length-i])
            return false;
       return paliindrome(s, i+1);

    }

    //Fibonacii 
    public static int fibonacci(int n)
    {
        if (n<=1) {
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}