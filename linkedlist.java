

import java.util.LinkedList;
public class linkedlist {

    public static void main(String[] args) {
          LinkedList<String> animals = new LinkedList<>();
          
          
// insertion
        animals.add("Fish");
        animals.addFirst("Cat");
        animals.addLast("Elephant");
        animals.add(1, "Lion");

        System.out.println("Linked List Original: " + animals);
        System.out.println(animals.size());

//  Seraching  
        if (animals.contains("Lion")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        boolean containslion = animals.contains("Lion");
        System.out.println(containslion);

//      
    }

}


    