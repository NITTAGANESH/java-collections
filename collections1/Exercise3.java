// Write a Java program to remove the third element from a array list.

import java.util.*;
 public class Exercise3 {
  public static void main(String[] args) {
  // Creae a list and add some colors to the list
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Red");
  list_Strings.add("Green");
  list_Strings.add("Orange");
  list_Strings.add("White");
  list_Strings.add("Black");

  System.out.println(list_Strings);

  list_Strings.remove(3);

  System.out.println("After removing the fourth element from list: \n"+list_Strings);
 }
}