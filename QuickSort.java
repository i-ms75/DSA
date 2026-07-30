public class QuickSort {
    public static void main(String[] args) {
        int array[]={4,6,2,5,7,9,1,3};
      for (int element : quickSort(array, 0, array.length-1)) {
        System.out.print(element+", ");
      }
    }

    static int[] quickSort(int[] array, int low, int high) {
        if(high>low)
        {
            int pivot=array[low];
            int left=low;
            int right=high;

            while (right>left) {
                while (array[left]<=pivot && left<=high-1) {
                    left++;
                }

                while (array[right]>pivot && right>=low+1) {
                    right--;
                    
                }
                if (right>left) {
                    int temp=array[left];
                    array[left]=array[right];
                    array[right]=temp;
                }
                
            }
            array[low]=array[right];
            array[right]=pivot;
            quickSort(array, low, right-1);
            quickSort(array, right+1, high);
        }
       return array;
    }

    

    
}
