import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int array[]={1,4,3,9,5,7,5,4,2,6};
        mergeSort(array, 0, array.length-1);
        for (int element : array) {
            System.out.print(element+",");
        }
        
    }
    
    // Divide the array till it has only one element left then call the merge array
    static void mergeSort(int[] array, int low, int high) {
        if(low>=high)
            return;
        
        int mid=(low+high)/2;
        mergeSort(array, low, mid);
        mergeSort(array, mid+1, high);
        merge(array,low,mid,high);

        

    }

    //compare, sort and then merge the array
    static void merge(int[] array, int low, int mid, int high) {
        ArrayList<Integer> temp=new ArrayList<>();

        int left=low;
        int right=mid+1;

        while (left<=mid && right<=high) {
            if(array[left]<array[right])
            {
                temp.add(array[left]);
                left++;
            }
            else {
                temp.add(array[right]);
                right++;
            }
            
        }

        while (left<=mid) {
            temp.add(array[left]);
            left++;
        }


        while (right<=high) {
            temp.add(array[right]);
            right++;
        }

        for(int i=low;i<=high;i++) {
            array[i]=temp.get(i-low);
        }
    }
    
}
