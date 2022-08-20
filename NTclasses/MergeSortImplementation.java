public class MergeSortImplementation {

    static void merge(char[] inputArray, int leftIndex, int mid, int rightIndex)
    int i = leftIndex;
    int j = mid + 1;
    int k = leftIndex;
    int leftArraySize = mid - leftIndex + 1;
    int rightArraySize = rightIndex - mid;
    char[] leftArray = new charrightIndex - mid;


bn


    static void mergeSort(char[] inputArray, int leftIndex, int right)
    if(leftIndex < rightIndex) {
        int mid = (leftIndex + rightIndex) / 2;
        mergeSort(inputArray, leftIndex, mid);
        mergeSort(inputArray, mid+1, rightIndex);

        merge(inputArray, leftIndex, mid, rightIndex);
    }
}
public static void main(String[] args) {

}
