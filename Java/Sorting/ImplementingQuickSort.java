/*
// Information about the arguments given in function
arr[]: input array
start: starting index of array
end: ending index of array
*/
    public static int[] quickSort(int arr[], int l, int r){
        if (l >= r) return arr;
        int pivot = arr[r];
        int pi = partitionIndex(arr, pivot, l, r);
        quickSort(arr, l, pi - 1);
        quickSort(arr, pi + 1, r);
        return arr;
  }
  
  public static int partitionIndex(int[] arr, int pivot, int l, int r) {
        int i = l;
        int j = l;
        while (i <= r) {
              if (arr[i] <= pivot) {
                    swap(arr, i, j);
                    i++;
                    j++;
              } else {
                    i++;
              }
        }
        return j - 1;
  }
  
  public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
  }

  /*
   Sample Input:
2
3
3 1 2
3
4 5 6

Sample Output:
1 2 3
4 5 6
   */