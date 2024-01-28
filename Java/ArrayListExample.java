package Activities;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String args[]) {

        ArrayList<String> myList = new ArrayList<String>();

        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("E");

        for (String s : myList) {

            System.out.println(s);
        }

            System.out.println(myList.get(2));
            myList.contains("B");
            myList.size();
            myList.remove(4);
            myList.size();

        }
    }

