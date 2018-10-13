/*
We can determine how "out of order" an array A is by counting the number of inversions it has. 
Two elements A[i] and A[j] form an inversion if A[i] > A[j] but i < j. 
That is, a smaller element appears after a larger element.
Given an array, count the number of inversions it has. Do this faster than O(N^2) time.
You may assume each element in the array is distinct.
For example, a sorted list has zero inversions. 
The array [2, 4, 1, 3, 5] has three inversions: (2, 1), (4, 1), and (4, 3). 
The array [5, 4, 3, 2, 1] has ten inversions: every distinct pair forms an inversion.

 */
package countinversionsinarray;

public class CountInversionsInArray {

       /* This method sorts the input array and returns the 
       number of inversions in the array */
    static int mergeSort(int arr[], int array_size) 
    { 
        int temp[] = new int[array_size]; 
        return _mergeSort(arr, temp, 0, array_size - 1); 
    } 
  
    /* An auxiliary recursive method that sorts the input array and 
      returns the number of inversions in the array. */
    static int _mergeSort(int arr[], int temp[], int left, int right) 
    { 
        int mid, inv_count = 0; 
        if (right > left) { 
            /* Divide the array into two parts and call _mergeSortAndCountInv() 
           for each of the parts */
            mid = (right + left) / 2; 
  
            /* Inversion count will be sum of inversions in left-part, right-part 
          and number of inversions in merging */
            inv_count = _mergeSort(arr, temp, left, mid); 
            inv_count += _mergeSort(arr, temp, mid + 1, right); 
  
            /*Merge the two parts*/
            inv_count += merge(arr, temp, left, mid + 1, right); 
        } 
        return inv_count; 
    } 
  
    /* This method merges two sorted arrays and returns inversion count in 
       the arrays.*/
    static int merge(int arr[], int temp[], int left, int mid, int right) 
    { 
        int i, j, k; 
        int inv_count = 0; 
  
        i = left; /* i is index for left subarray*/
        j = mid; /* j is index for right subarray*/
        k = left; /* k is index for resultant merged subarray*/
        while ((i <= mid - 1) && (j <= right)) { 
            if (arr[i] <= arr[j]) { 
                temp[k++] = arr[i++]; 
            } 
            else { 
                temp[k++] = arr[j++]; 
  
                /*this is tricky -- see above explanation/diagram for merge()*/
                inv_count = inv_count + (mid - i); 
            } 
        } 
  
        /* Copy the remaining elements of left subarray 
       (if there are any) to temp*/
        while (i <= mid - 1) 
            temp[k++] = arr[i++]; 
  
        /* Copy the remaining elements of right subarray 
       (if there are any) to temp*/
        while (j <= right) 
            temp[k++] = arr[j++]; 
  
        /*Copy back the merged elements to original array*/
        for (i = left; i <= right; i++) 
            arr[i] = temp[i]; 
  
        return inv_count; 
    } 
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = new int[] { 1, 20, 6, 4, 5 }; 
        System.out.println("Number of inversions are " + mergeSort(arr, 5)); 
    }
    
}
