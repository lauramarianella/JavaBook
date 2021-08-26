package MyPkg.CH_23.Sorting;

public class _23_04_BubbleSort2 {
    public static int numSwaps=0;
    /** Bubble sort method */
    public static void bubbleSort(int[] list) {
       for (int i = 0; i < list.length; i++) {
        // Array may be sorted and next pass not needed
        for (int j = 0; j < list.length - i-1; j++) {
          if (list[j] > list[j + 1]) {
            // Swap list[i] with list[i + 1]
            int temp = list[j];
            list[j] = list[j + 1];
            list[j + 1] = temp;
            numSwaps++;
          }
        }
      }
  }

  /** A test method */
  /*int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};*/
  public static void main(String[] args) {
    //int[] list = {1, 2, 4, 5, 6, 8, 9 };//zero swaps
    int[] list={2,9,5,4,8,1,6};//11 swaps
    //int[] list={9,8,6,5,4,2,1};//n=7 = > 21 swaps
    bubbleSort(list);
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + " ");
    
    System.out.println("\n"+ numSwaps);
  }
}