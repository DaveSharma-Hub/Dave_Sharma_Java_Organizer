package DOP;

public class Sorting {
	
	public int [] bubbleSort(int [] arr) {//O(n^2) time
		int [] tmp=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			tmp[i]=arr[i];
		}
		while(!check(tmp)) {
			for(int i=0;i<arr.length-1;i++){
				if(tmp[i]>tmp[i+1]) {
					int holder=tmp[i];
					tmp[i]=tmp[i+1];
					tmp[i+1]=holder;
				}
			}
		}
		return tmp;
	}

	public int [] selectionSort(int [] arr) {//O(n^2)
		
		int [] tmp=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			tmp[i]=arr[i];
		}
		int counter=0;
		for(int i=0;i<arr.length;i++) {
			int min=Integer.MAX_VALUE;
			for(int j=i;j<arr.length;j++) {
				
				if(min>tmp[j]){
					min=tmp[j];
					counter=j;
				}
				
			}
			int holder=tmp[i];
			tmp[i]=tmp[counter];
			tmp[counter]=holder;
		}
		
		
		return tmp;
	}
	

public void swap(int[] arr, int i, int j)
{
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
 
/* This function takes last element as pivot, places
   the pivot element at its correct position in sorted
   array, and places all smaller (smaller than pivot)
   to left of pivot and all greater elements to right
   of pivot */
public int partition (int[] arr, int low, int high)
{
     
    // pivot
    int pivot = arr[high];
     
    // Index of smaller element and
    // indicates the right position
    // of pivot found so far
    int i = (low - 1);
 
    for(int j = low; j <= high - 1; j++)
    {
         
        // If current element is smaller
        // than the pivot
        if (arr[j] < pivot)
        {
             
            // Increment index of
            // smaller element
            i++;
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, high);
    return (i + 1);
}
 
/* The main function that implements QuickSort
          arr[] --> Array to be sorted,
          low --> Starting index,
          high --> Ending index
 */
public void quickSort(int[] arr, int low, int high)
{
    if (low < high)
    {
         
        // pi is partitioning index, arr[p]
        // is now at right place
        int pi = partition(arr, low, high);
 
        // Separately sort elements before
        // partition and after partition
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}
	public int[] quickSorting(int []arr) {
		int [] tmp=new int[arr.length];
		quickSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			tmp[i]=arr[i];
		}
		
		return tmp;
		
	}
	/*
	
	public int [] heapSort(int [] arr) {
		
		
		
	}
	*/
	public boolean check(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	

	
}


