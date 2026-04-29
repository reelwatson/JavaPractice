package org.example;
import java.util.LinkedList;

public class SinglyLinkedList {
    public static void main (String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.practiceQueue();
    }

    public void practiceQueue() {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.push("Brother Dawn");
        linkedList.push("Brother Day");
        linkedList.push("Brother Dusk");
        linkedList.push("Brother Night");
        linkedList.push("Demerzel");
        System.out.println(linkedList);

        linkedList.pop();
        System.out.println(linkedList);

        linkedList.pop();
        System.out.println(linkedList);


        linkedList.offer("Hari Seldon");
        linkedList.offer("Gaal Dornick");
        linkedList.offer("Salvor Hardin");
        System.out.println(linkedList);

        linkedList.poll();
        System.out.println(linkedList);

        linkedList.add(2, "Demerzel");
        System.out.println(linkedList);

        linkedList.addFirst("Kalle");
        System.out.println(linkedList);

        linkedList.remove("Salvor Hardin");
        System.out.println(linkedList);

        System.out.println("The index for Hari Seldon is " + linkedList.indexOf("Hari Seldon"));

        System.out.println("Let's take a look at the first node: " + linkedList.peekFirst());
        System.out.println("And now for the last node: " + linkedList.peekLast());

        linkedList.addLast("The Mule");
        System.out.println(linkedList);

    }

}
