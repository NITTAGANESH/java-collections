// Write a Java program to extract a portion of a array list.

import java.util.*;
  public class Exercise5 {
  public static void main(String[] args) {
  // Creae a list and add some colors to the list
    List<String> list_Strings = new ArrayList<String>();
    list_Strings.add("Red");
    list_Strings.add("Green");
    list_Strings.add("Orange");
    list_Strings.add("White");
    list_Strings.add("Black");

    System.out.println("Oringinal list: "+ list_Strings);

    List<String> sub_list = list_Strings.subList(0,3);
    
    System.out.println("Elements from 1 to 3 in list: " + sub_list);

 }
}