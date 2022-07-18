public class BinarySearch{
    public int binarySearchIteratively(int sortedArray[], int key){
        int low = 0;
        int high = sortedArray.length-1;
        int index = Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            if(sortedArray[mid]<key){
                low=mid+1;
            }else if(sortedArray[mid]>key){
                high = mid-1;
            }else if(sortedArray[mid]==key){
                index = mid;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int sortedArray[] ={1,2,3,4,5,5,6,7,8,9,9};
        int key = 3;
        BinarySearch binSearch = new BinarySearch();
        int index = binSearch.binarySearchIteratively(sortedArray, key);
        System.out.println("Search Element found "+key+" in location index : "+index);
    }
}