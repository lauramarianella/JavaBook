package MyPkg.CH_20.Collections;

import java.util.*;

public class _20_11_0_PriorityQueueDemo {
  public static void main(String[] args) {
    PriorityQueue<String> queue1 = new PriorityQueue<>(4, new MyOtherComparator());
    queue1.offer("Oklahoma");
    queue1.offer("Indiana");
    queue1.offer("Georgia");
    queue1.offer("Texas");

    System.out.println("Priority queue using Comparable:");//Georgia Indiana Oklahoma Texas (alphabetic order)
    while (queue1.size() > 0) {
      System.out.print(queue1.remove() + " ");
    }

    PriorityQueue<String> queue2 = new PriorityQueue<>(4, Collections.reverseOrder());//Texas Oklahoma Indiana Georgia 
    queue2.offer("Oklahoma");
    queue2.offer("Indiana");
    queue2.offer("Georgia");
    queue2.offer("Texas");

    System.out.println("\nPriority queue using Comparator:");
    while (queue2.size() > 0) {
      System.out.print(queue2.remove() + " ");
    }
  }
  
  
  
   public static class MyLengthComparator implements java.util.Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
      return s1.length() - s2.length();
    }
  }
   public static class MyOtherComparator implements java.util.Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        if(s1.startsWith("G"))return 10;
        else return s1.length() - s2.length();
    }
  }
}