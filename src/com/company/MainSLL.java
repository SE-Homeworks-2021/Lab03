package com.company;

//public class MainSLL {
//    public static void main(String[] args) {
//        SLL sll = new SLL();
//        sll.addFirst(2);
//        sll.addLast(3);
//        sll.addFirst(1);
//        sll.print();
//        sll.removeFirst();
//        sll.print();
//        sll.removeLast();
//        sll.print();
//    }
//}

//public class MainSLL{
//    public static void main(String[] args){
//        SLL sll = new SLL();
//        System.out.println("=== Empty SLL ===");
//        System.out.println("Size = "+ sll.getSize());
//        System.out.println("Empty = " + sll.isEmpty());
//        System.out.println();
//
//        //add elements
//        sll.addLast(11);
//        sll.addLast(22);
//        sll.addLast(11);
//        System.out.println("=== After adding elements ===");
//        System.out.println("Size = "+ sll.getSize());
//        System.out.println("Empty = " + sll.isEmpty());
//        System.out.println("Element 0 = " + sll.get(0));
//        System.out.println("Element 1 = " + sll.get(1));
//        System.out.println("Element 2 = " + sll.get(2));
//        System.out.println();
//
//        //clear
//        sll.clear();
//        System.out.println("=== After clearing elements ===");
//        System.out.println("Size = "+ sll.getSize());
//        System.out.println("Empty = " + sll.isEmpty());
//    }
//}

public class MainSLL{
    public static void main(String[] args){
        SLL sll = new SLL();
        sll.addFirst(11);
        sll.addLast(22);
        sll.addLast(11);
        sll.print();

        System.out.println();
        System.out.println("Find element 11: "+sll.findElement(11));
        System.out.println("Find element 22: "+sll.findElement(22));
        System.out.println("Find element 33: "+sll.findElement(33));
        System.out.println("Count element 11: "+sll.countElement(11));
        System.out.println("Count element 22: "+sll.countElement(22));
        System.out.println("Count element 33: "+sll.countElement(33));
        System.out.println("Sum of all elements: "+sll.sumElement());
    }
}
