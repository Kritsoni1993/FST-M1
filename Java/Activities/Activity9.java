package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    public static void main(String[] args){
        List<String> myList = new ArrayList<String>();
        myList.add("Umakant");
        myList.add("Kunal");
        myList.add("Kartik");
        myList.add("Ankit");
        myList.add("Ankush");
        System.out.println("Print All the Objects:");
        for(String name:myList)
            System.out.println(name);
        System.out.println("3rd element in the list is: " +myList.get(2));
        System.out.println("Is Ankit in list: " + myList.contains("Ankit"));
        System.out.println("Size of ArrayList: " +myList.size());
        myList.remove("Ankit");
        System.out.println("New size of ArrayList: " +myList.size());
    }
}
