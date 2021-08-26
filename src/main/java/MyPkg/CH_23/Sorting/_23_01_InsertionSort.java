package MyPkg.CH_23.Sorting;


public class _23_01_InsertionSort {
  /** The method for sorting the numbers */
  public static int numSwaps=0;
  public static void insertionSort(int[] list) {
    for (int i = 1; i < list.length; i++) {
      /** insert list[i] into a sorted sublist list[0..i-1] so that
          list[0..i] is sorted. */
      int currentElement = list[i];
      int k;
      for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
        list[k + 1] = list[k];
        numSwaps++;        
      }

      // Insert the current element into list[k+1]
      list[k + 1] = currentElement;
    }
  }
  
  /** A test method */
  int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
  public static void main(String[] args) {
    //int[] list = {1, 2, 4, 5, 6, 8, 9 };//zero swaps
    //int[] list={2,9,5,4,8,1,6};//11 swaps
    int[] list={9,8,6,5,4,2,1};//n=7 = > 21 swaps
    
    //int[] list={9,8,6,5,4};//n=5 = > 10 swaps
    //int[] list={9,8,6,5};//n=4 = >6 swaps
    //int[] list={9,8,6};//n=3 = >3 swaps
    //int[] list={9,8};//n=2 = >1 swaps
    
    insertionSort(list);
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + " ");
    
    System.out.println("\n"+ numSwaps);
  }
}