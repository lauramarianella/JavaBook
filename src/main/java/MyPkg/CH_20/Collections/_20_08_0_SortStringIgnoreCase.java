package MyPkg.CH_20.Collections;

public class _20_08_0_SortStringIgnoreCase {
  public static void main(String[] args) {
    java.util.List<String> cities = java.util.Arrays.asList("Atlanta", "Savannah", "new York", "dallas");
    
    //https://www.w3schools.com/java/ref_string_compareto.asp
    //http://www.haghish.com/statistics/stata-blog/stata-programming/ascii_characters.php
    cities.sort((s1, s2) -> s1.compareTo(s2));    
    for (String s: cities) {
      System.out.print(s + " ");
    }
    
    System.out.print("\n");
    
    //alphabethical order
    //https://www.w3schools.com/java/ref_string_comparetoignorecase.asp
    cities.sort((s1, s2) -> s1.compareToIgnoreCase(s2));    
    for (String s: cities) {
      System.out.print(s + " ");
    }
  }
}